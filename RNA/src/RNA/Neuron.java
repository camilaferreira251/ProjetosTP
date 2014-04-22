/*Class Neuron 
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

public class Neuron {

	private double[] weights = null;
	private double bias = 1;

	public Neuron(int connections, int bias) {
		weights = new double[connections];
		this.bias = bias;
	}

	public int getLenght() {
		return weights.length;
	}

	public double getWeight(int index) {
		return weights[index];
	}

	public void setWeight(int index, double weight) {
		weights[index] = weight;
	}

	public double getBias() {
		return bias;
	}

	public void setBias(double b) {
		bias = b;
	}

	public void correctWeight(int i, double delta) {
		weights[i] += delta;
	}

	public void correctBias(double delta) {
		bias += delta;
	}

	protected void randomizeWeights(int option) {
		switch (option) {
		case 0:
			for (int i = 0; i < weights.length; i++) {
				weights[i] = Math.random();
			}
			break;
		case 1:
			for (int i = 0; i < weights.length; i++) {
				weights[i] = (Math.random() - 1 / 2) * 2;
			}
			break;
		case 2:
			for (int i = 0; i < weights.length; i++) {
				weights[i] = Math.random() - 1;
			}
			break;
		default:
		}
	}
}
