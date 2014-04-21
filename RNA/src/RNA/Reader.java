/* Class Leitor
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

import java.io.BufferedReader;
import java.io.FileReader;

public class Reader {

    public final int trainingSize = 48; //era 18
    private final double[][] trainignInput = new double[trainingSize][19];
    private final double[][] trainingDesiredOutput = new double[trainingSize][1];
    private double inputTest[][] = new double[Operator.TEST_SIZE][19];
    private double desiredOutputTest[][] = new double[Operator.TEST_SIZE][1];

    public void uploadFiles() {
        int j;
        try {
            j = 0;
            FileReader file = new FileReader("TREINO.txt");
            BufferedReader fileReader = new BufferedReader(file);
            fileReader.mark(500);

            while (fileReader.readLine() != null && j < trainingSize) {
                fileReader.reset();
                String s[] = new String[20];
                String linha = fileReader.readLine();
                s = linha.split(";");

                for (int i = 0; i < 19; i++) {
                    trainignInput[j][i] = Double.parseDouble(s[i]);
                }

                trainingDesiredOutput[j][0] = Double.parseDouble(s[19]);
                j++;
                fileReader.mark(500);
            }
            file.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }

        try {
            j = 0;
            FileReader file = new FileReader("TESTE.txt");
            BufferedReader fileReader = new BufferedReader(file);
            fileReader.mark(500);

            while (fileReader.readLine() != null && j < Operator.TEST_SIZE) {
                fileReader.reset();
                String s[] = new String[20];
                String linha = fileReader.readLine();
                s = linha.split(";");

                for (int t = 0; t < 19; t++) {
                    inputTest[j][t] = Double.parseDouble(s[t]);
                }
                desiredOutputTest[j][0] = Double.parseDouble(s[19]);
                j++;
                fileReader.mark(500);
            }
            file.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }
    }

    public double[][] getInput() {
        return trainignInput;
    }

    public double[][] getDesiredOutput() {
        return trainingDesiredOutput;
    }

    public double[][] getInputTest() {
        return inputTest;
    }

    public double[][] getTesteSaidaEsperada() {
        return desiredOutputTest;
    }
}
