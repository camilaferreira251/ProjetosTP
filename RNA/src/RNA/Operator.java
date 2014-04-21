/*Class Operator
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

import RNA.MultilayerPerceptron;
import RNA.BackPropagation;

public class Operator {

	public static MultilayerPerceptron m;
	public static Reader reader;
	public static double inputs[] = new double[19];
	public static final int TEST_SIZE = 86;
	public static int madeIterations = 0;
	public static double errorCalculation = 1;

	public static void train(double learning, double time, int bias,
			int function, int range, int iterations, double error) {
		reader = new Reader();
		reader.uploadFiles();
		
		m = new MultilayerPerceptron(3, function, bias, range);

		m.insertInPutLayer(19, 19);
		m.addLayer(6);
		m.addLayer(1);

		BackPropagation b = new BackPropagation(m, learning, time);
		errorCalculation = 1;
		int i;
		for (i = 0; i < iterations && errorCalculation > error; i++) {
			double erroAux = 0;
			double outputs[] = new double[reader.trainingSize];

			for (int k = 0; k < reader.trainingSize; k++) {
				b.train(reader.getInput()[k], reader.getDesiredOutput()[k]);
				outputs[k] = m.getOutPut(0);
			}
			erroAux = b.calculateError(reader, outputs);
			errorCalculation = erroAux;
		}
		madeIterations = i;

		for (int w = 0; w < TEST_SIZE; w++) {
			m.Advance(reader.getInputTest()[w]);
		}
	}

	public static int test() {
		int sum = 0;
		for (int w = 0; w < 86; w++) {
			m.Advance(reader.getInputTest()[w]);
			if (m.getOutPut(0) > 0.5) {
				sum++;
			}
		}
		return sum - 8;
	}

	public static double operate() {
		m.Advance(inputs);
		return m.getOutPut(0);
	}
}