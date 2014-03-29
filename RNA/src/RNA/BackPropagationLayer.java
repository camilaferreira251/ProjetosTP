/*Class BackPropagationLayer
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

class BackPropagationLayer {
	private double[] errors = null;
	private NeuronBackPropagation[] neuron = null;

	BackPropagationLayer(int size, int neuronSize) {
		errors = new double[size];
		neuron = new NeuronBackPropagation[size];

		for (int i = 0; i < neuron.length; i++) {
			errors[i] = 0;
			neuron[i] = new NeuronBackPropagation(neuronSize);
		}
	}

	final void setError(int i, double value) {
		errors[i] = value;
	}

	final double getError(int i) {
		return errors[i];
	}

	final NeuronBackPropagation getNeuronBackPropagation(int i) {
		return neuron[i];
	}

	int getSize() {
		return neuron.length;
	}
}
