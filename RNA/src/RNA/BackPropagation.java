/*Class BackPropagation
 * RNA is free software: you can redistribute it and / or

     modify it under the terms of the GNU General Public License as

     published by the Free Software Foundation (FSF), version 2 of the

     License, or (at your option) any later version.

     This program is distributed in the hope that it will be useful,

     but WITHOUT ANY WARRANTY; without even the implied warranty of fitness for any

     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. View

     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License

     along with this program, if not, write to the Foundation of Software

     Free (FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA */

package RNA;

import RNA.Function;
import RNA.Sigmoide;
import RNA.TgHip;
import RNA.Reader;

public class BackPropagation {

	private MultilayerPerceptron m = null;
	private BackPropagationLayer[] layer = null;
	private Function f = null;
	private double txAprendizado = 0.2;
	private double moment = 0.5;

	public BackPropagation(MultilayerPerceptron m) {

		this.m = m;
		if (m.getFunctionType() == 0) {
			f = new Sigmoide();
		} else {
			f = new TgHip();
		}

		int tamanho = m.getSize();
		layer = new BackPropagationLayer[tamanho];

		for (int i = 0; i < tamanho; i++) {
			layer[i] = new BackPropagationLayer(m.getLayer(i).getSize(), m
					.getLayer(i).getTamanhoNeuronio());
		}
	}

	public BackPropagation(MultilayerPerceptron m, double txAprend,
			double moment) {
		this(m);

		this.txAprendizado = txAprend;
		this.moment = moment;
	}

	public void setTaxaAprendizado(double txAprend) {
		this.txAprendizado = txAprend;
	}

	public double getTaxaAprendizado() {
		return txAprendizado;
	}

	public void setMomento(double moment) {
		this.moment = moment;
	}

	public double getMomento() {
		return moment;
	}

	public void backward(double[] entrada, double[] saidaDesejada) {

		calcularErrosUltimaCamada(saidaDesejada);
		calcularErrosInternos();
		calcularDeltas(entrada);
		corrigirPesos();
	}

	public void treinar(double[] entry, double[] desiredOutput) {

		m.Advance(entry);

		backward(entry, desiredOutput);
	}

	private void calcularErrosUltimaCamada(double[] desiredOutput) {
		Layer c = m.getLastLayer();
		BackPropagationLayer ultima = layer[layer.length - 1];

		int size = ultima.getSize();

		for (int i = 0; i < size; i++) {
			ultima.setError(
					i,
					(desiredOutput[i] - c.getOutPut(i))
							* f.derived(c.getOutPut(i)));
		}
	}

	private void calcularErrosInternos() {
		double error;

		for (int i = layer.length - 2; i >= 0; i--) {
			for (int j = 0; j < layer[i].getSize(); j++) {
				error = 0;
				for (int k = 0; k < layer[i + 1].getSize(); k++) {

					double pesoNeuronio = m.getLayer(i + 1).getNeuronio(k)
							.getPeso(j);
					double erroNeuronio = layer[i + 1].getError(k);
					error += pesoNeuronio * erroNeuronio;
				}
				error *= f.derived(m.getLayer(i).getOutPut(j));
				layer[i].setError(j, error);
			}
		}
	}

	private void calcularDeltas(double[] entrada) {
		int i, j, k;

		for (i = 0; i < layer.length; i++) {
			for (j = 0; j < layer[i].getSize(); j++) {
				for (k = 0; k < layer[i].getNeuronBackPropagation(j)
						.getSize(); k++) {
					layer[i].getNeuronBackPropagation(j).setDeltaw(
							k,
							txAprendizado * entrada[k] * layer[i].getError(j)
									+ moment
									* layer[i].getNeuronBackPropagation(j).getDeltaw(k));
				}
				layer[i].getNeuronBackPropagation(j).setDeltaBias(
						txAprendizado * (-1) * layer[i].getError(j) + moment
								* layer[i].getNeuronBackPropagation(j).getDeltaBias());
			}
			entrada = m.getLayer(i).getOutPuts();
		}
	}

	private void corrigirPesos() {
		int i, j, k;

		for (i = 0; i < m.getSize(); i++) {
			for (j = 0; j < m.getLayer(i).getSize(); j++) {
				Neuron n = m.getLayer(i).getNeuronio(j);
				for (k = 0; k < n.getTamanho(); k++) {
					n.corrigirPeso(k, layer[i].getNeuronBackPropagation(j).getDeltaw(k));
				}
				n.corrigirBias(layer[i].getNeuronBackPropagation(j).getDeltaBias());
			}
		}
	}

	public double calcularErro(Reader dados, double saida[]) {
		double soma = 0;
		for (int j = 0; j < dados.trainingSize; j++) {
			soma += Math.pow((saida[j] - dados.getSaidaDesejada()[j][0]), 2);
		}
		return Math.sqrt(soma / dados.trainingSize);
	}

}
