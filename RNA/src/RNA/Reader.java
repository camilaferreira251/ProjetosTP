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

    public final int tamanhoTreinamento = 48; //era 18
    private final double[][] entradaTreinamento = new double[tamanhoTreinamento][19];
    private final double[][] saidaDesejadaTreinamento = new double[tamanhoTreinamento][1];
    private double testeEntrada[][] = new double[Operator.TAMANHOTESTE][19];
    private double testeSaidaEsperada[][] = new double[Operator.TAMANHOTESTE][1];

    public void carregarArquivos() {
        int j;
        try {
            j = 0;
            FileReader file = new FileReader("TREINO.txt");
            BufferedReader fileReader = new BufferedReader(file);
            fileReader.mark(500);

            while (fileReader.readLine() != null && j < tamanhoTreinamento) {
                fileReader.reset();
                String s[] = new String[20];
                String linha = fileReader.readLine();
                s = linha.split(";");

                for (int i = 0; i < 19; i++) {
                    entradaTreinamento[j][i] = Double.parseDouble(s[i]);
                }

                saidaDesejadaTreinamento[j][0] = Double.parseDouble(s[19]);
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

            while (fileReader.readLine() != null && j < Operator.TAMANHOTESTE) {
                fileReader.reset();
                String s[] = new String[20];
                String linha = fileReader.readLine();
                s = linha.split(";");

                for (int t = 0; t < 19; t++) {
                    testeEntrada[j][t] = Double.parseDouble(s[t]);
                }
                testeSaidaEsperada[j][0] = Double.parseDouble(s[19]);
                j++;
                fileReader.mark(500);
            }
            file.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }
    }

    public double[][] getEntrada() {
        return entradaTreinamento;
    }

    public double[][] getSaidaDesejada() {
        return saidaDesejadaTreinamento;
    }

    public double[][] getTesteEntrada() {
        return testeEntrada;
    }

    public double[][] getTesteSaidaEsperada() {
        return testeSaidaEsperada;
    }
}
