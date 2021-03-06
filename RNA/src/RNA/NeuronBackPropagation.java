/*Class NeuronBP 
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

class NeuronBackPropagation {

	private double[] deltaw = null;
	private double deltaBias = 0;

	NeuronBackPropagation(int size) {
		deltaw = new double[size];

		for (int i = 0; i < deltaw.length; i++) {
			deltaw[i] = 0;
		}
	}

	final double getDeltaw(int i) {
		return deltaw[i];
	}

	final void setDeltaw(int i, double value) {
		deltaw[i] = value;
	}

	final double getDeltaBias() {
		return deltaBias;
	}

	final void setDeltaBias(double deltaBias) {
		this.deltaBias = deltaBias;
	}

	int getSize() {
		return deltaw.length;
	}
}
