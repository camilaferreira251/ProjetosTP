/*Class MultilayerPerceptron
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

public class MultilayerPerceptron {

    private Layer[] layer;
    private int lastLayer = -1;
    private int functionType;
    private int bias;
    private int intervalRand;

    public MultilayerPerceptron(int numberLayer, int function, int bias,int interval) {
        this.layer = new Layer[numberLayer];
        this.functionType=function;
        this.bias=bias;
        this.intervalRand=interval;
    }

    public void insertInPutLayer(int a, int b) {
        layer[0] = new Layer(a,b,functionType,bias, intervalRand);
        lastLayer = 0;
    }

    public void addCamada(int numberNeuron) {

        layer[lastLayer + 1] = new Layer(numberNeuron, layer[lastLayer].getSize(),functionType,bias,intervalRand);

        lastLayer++;
    }


    public void Advance(double[] inputs) {

        for (int i = 0; i < layer.length; i++) {
            layer[i].Calcular(inputs);

            inputs = layer[i].getOutPuts();
        }

    }

    public double getOutPut(int neuron) {
        return layer[lastLayer].getOutPut(neuron);
    }

    public int getSize() {
        return layer.length;
    }

    public final Layer getLayer(int i) {
        return layer[i];
    }

    public final Layer getLastLayer() {
        return layer[lastLayer];
    }

    public int getFunctionType() {
        return functionType;
    }
    
    
}
