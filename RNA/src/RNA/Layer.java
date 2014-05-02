/* Class Layer
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

public class Layer {

    private Neuron[] neurons;
    private double[] outings;
    private Function f;


    Layer(int n, int conexoes,int funcao, int bias,int intervalo) {
        
        if(funcao==0)
            f = new Sigmoide();
        else
            f=new TgHip();
        
        neurons = new Neuron[n];
        outings = new double[n];

        for (int i = 0; i < neurons.length; i++) {
            neurons[i] = new Neuron(conexoes,bias);
            neurons[i].randomizeWeights(intervalo);
        }
    }

    void Calcular(double[] entradas) {

        for (int i = 0; i < neurons.length; i++) {
            outings[i] = f.function(rede(i, entradas));
        }
    }

    public int getSize() {
        return neurons.length;
    }

    public double getOutPut(int index) {
        return outings[index];
    }

    public double[] getOutPuts() {
        return outings;
    }

    public Neuron getNeuronio(int i) {
        return neurons[i];
    }

    public int getTamanhoNeuronio() {
        return neurons[0].getLenght();
    }

    private double rede(int neuronio, double[] entradas) {
        double u = 0;

        for (int i = 0; i < entradas.length; i++) {
            u += entradas[i] * neurons[neuronio].getWeight(i);
        }
        
        u -= neurons[neuronio].getBias();
        return u;
    }
}
