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
import RNA.Leitor;

public class BackPropagation {

    private MLP m = null;
    private CamadaBP[] camadas = null;
    private Function f = null;
    private double txAprendizado = 0.2;
    private double momento = 0.5;

    public BackPropagation(MLP m) {

        this.m = m;
        if (m.getTipoFuncao() == 0) {
            f = new Sigmoide();
        } else {
            f = new TgHip();
        }

        int tamanho = m.getTamanho();
        camadas = new CamadaBP[tamanho];

        for (int i = 0; i < tamanho; i++) {
            camadas[i] = new CamadaBP(m.getCamada(i).getTamanho(), 
            		m.getCamada(i).getTamanhoNeuronio());
        }
    }

    public BackPropagation(MLP m, double txAprend, double moment) {
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

        m.Avancar(entrada);

        backward(entrada, saidaDesejada);
    }

    private void calcularErrosUltimaCamada(double[] saidaDesejada) {
        Camada c = m.getUltimaCamada();
        CamadaBP ultima = camadas[camadas.length - 1];

        int tamanho = ultima.getTamanho();

        for (int i = 0; i < tamanho; i++) {
            ultima.setErro(i, (saidaDesejada[i] - c.getSaida(i)) * f.derivada(c.getSaida(i)));
        }
    }

    private void calcularErrosInternos() {
        double erro;

        for (int i = camadas.length - 2; i >= 0; i--) {
            for (int j = 0; j < camadas[i].getTamanho(); j++) {
                erro = 0;
                for (int k = 0; k < camadas[i + 1].getTamanho(); k++) {

                    double pesoNeuronio = m.getCamada(i + 1).getNeuronio(k).getPeso(j);
                    double erroNeuronio = camadas[i + 1].getErro(k);
                    erro += pesoNeuronio * erroNeuronio;
                }
                erro *= f.derivada(m.getCamada(i).getSaida(j));
                camadas[i].setErro(j, erro);
            }
        }
    }

    private void calcularDeltas(double[] entrada) {
        int i, j, k;

        for (i = 0; i < camadas.length; i++) {
            for (j = 0; j < camadas[i].getTamanho(); j++) {
                for (k = 0; k < camadas[i].getNeuronioBP(j).getTamanho(); k++) {
                    camadas[i].getNeuronioBP(j).setDeltaw(k, txAprendizado * entrada[k] * camadas[i].getErro(j) + momento * camadas[i].getNeuronioBP(j).getDeltaw(k));
                }
                camadas[i].getNeuronioBP(j).setDeltaBias(txAprendizado * (-1) * camadas[i].getErro(j) + momento * camadas[i].getNeuronioBP(j).getDeltaBias());
            }
            entrada = m.getCamada(i).getSaidas();
        }
    }

    private void corrigirPesos() {
        int i, j, k;

        for (i = 0; i < m.getTamanho(); i++) {
            for (j = 0; j < m.getCamada(i).getTamanho(); j++) {
                Neuron n = m.getCamada(i).getNeuronio(j);
                for (k = 0; k < n.getTamanho(); k++) {
                    n.corrigirPeso(k, camadas[i].getNeuronioBP(j).getDeltaw(k));
                }
                n.corrigirBias(camadas[i].getNeuronioBP(j).getDeltaBias());
            }
        }
    }
    
        public double calcularErro(Leitor dados, double saida[]) {
        double soma = 0;
        for (int j = 0; j < dados.tamanhoTreinamento; j++) {
            soma += Math.pow((saida[j] - dados.getSaidaDesejada()[j][0]), 2);
           }
        return Math.sqrt(soma/dados.tamanhoTreinamento);
   }
    
}
