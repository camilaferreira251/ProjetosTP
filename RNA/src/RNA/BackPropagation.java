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
	private BackPropagationLayer[] camadas = null;
	private Function f = null;
	private double txAprendizado = 0.2;
	private double momento = 0.5;

	public BackPropagation(MultilayerPerceptron m) {

		this.m = m;
		if (m.getFunctionType() == 0) {
			f = new Sigmoide();
		} else {
			f = new TgHip();
		}

		int tamanho = m.getSize();
		camadas = new BackPropagationLayer[tamanho];

		for (int i = 0; i < tamanho; i++) {
			camadas[i] = new BackPropagationLayer(m.getLayer(i).getSize(), m
					.getLayer(i).getTamanhoNeuronio());
		}
	}

	public BackPropagation(MultilayerPerceptron m, double txAprend,
			double moment) {
		this(m);

		this.txAprendizado = txAprend;
		this.momento = moment;
	}

	public void setTaxaAprendizado(double txAprend) {
		this.txAprendizado = txAprend;
	}

	public double getTaxaAprendizado() {
		return txAprendizado;
	}

	public void setMomento(double moment) {
		this.momento = moment;
	}

	public double getMomento() {
		return momento;
	}

	public void backward(double[] entrada, double[] saidaDesejada) {

		calcularErrosUltimaCamada(saidaDesejada);
		calcularErrosInternos();
		calcularDeltas(entrada);
		corrigirPesos();
	}

	public void treinar(double[] entrada, double[] saidaDesejada) {

		m.Advance(entrada);

		backward(entrada, saidaDesejada);
	}

	private void calcularErrosUltimaCamada(double[] saidaDesejada) {
		Layer c = m.getLastLayer();
		BackPropagationLayer ultima = camadas[camadas.length - 1];

		int tamanho = ultima.getSize();

		for (int i = 0; i < tamanho; i++) {
			ultima.setError(
					i,
					(saidaDesejada[i] - c.getOutPut(i))
							* f.derived(c.getOutPut(i)));
		}
	}

	private void calcularErrosInternos() {
		double erro;

		for (int i = camadas.length - 2; i >= 0; i--) {
			for (int j = 0; j < camadas[i].getSize(); j++) {
				erro = 0;
				for (int k = 0; k < camadas[i + 1].getSize(); k++) {

					double pesoNeuronio = m.getLayer(i + 1).getNeuronio(k)
							.getPeso(j);
					double erroNeuronio = camadas[i + 1].getError(k);
					erro += pesoNeuronio * erroNeuronio;
				}
				erro *= f.derived(m.getLayer(i).getOutPut(j));
				camadas[i].setError(j, erro);
			}
		}
	}

	private void calcularDeltas(double[] entrada) {
		int i, j, k;

		for (i = 0; i < camadas.length; i++) {
			for (j = 0; j < camadas[i].getSize(); j++) {
				for (k = 0; k < camadas[i].getNeuronBackPropagation(j)
						.getSize(); k++) {
					camadas[i].getNeuronBackPropagation(j).setDeltaw(
							k,
							txAprendizado * entrada[k] * camadas[i].getError(j)
									+ momento
									* camadas[i].getNeuronBackPropagation(j).getDeltaw(k));
				}
				camadas[i].getNeuronBackPropagation(j).setDeltaBias(
						txAprendizado * (-1) * camadas[i].getError(j) + momento
								* camadas[i].getNeuronBackPropagation(j).getDeltaBias());
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
					n.corrigirPeso(k, camadas[i].getNeuronBackPropagation(j).getDeltaw(k));
				}
				n.corrigirBias(camadas[i].getNeuronBackPropagation(j).getDeltaBias());
			}
		}
	}

	public double calcularErro(Reader dados, double saida[]) {
		double soma = 0;
		for (int j = 0; j < dados.tamanhoTreinamento; j++) {
			soma += Math.pow((saida[j] - dados.getSaidaDesejada()[j][0]), 2);
		}
		return Math.sqrt(soma / dados.tamanhoTreinamento);
	}

}
