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
	public static Reader leitor;
	public static double entradas[] = new double[19];
	public static final int TAMANHOTESTE = 86;
	public static int iteracoesFeitas = 0;
	public static double calcErro = 1;

	public static void treinar(double aprendizado, double momento, int bias,
			int funcao, int intervalo, int iteracoes, double erro) {
		leitor = new Reader();
		leitor.carregarArquivos();
		
		m = new MultilayerPerceptron(3, funcao, bias, intervalo);

		m.insertInPutLayer(19, 19);
		m.addCamada(6);
		m.addCamada(1);

		BackPropagation b = new BackPropagation(m, aprendizado, momento);
		calcErro = 1;
		int i;
		for (i = 0; i < iteracoes && calcErro > erro; i++) {
			double erroAux = 0;
			double saidas[] = new double[leitor.tamanhoTreinamento];

			for (int k = 0; k < leitor.tamanhoTreinamento; k++) {
				b.treinar(leitor.getEntrada()[k], leitor.getSaidaDesejada()[k]);
				saidas[k] = m.getOutPut(0);
			}
			erroAux = b.calcularErro(leitor, saidas);
			calcErro = erroAux;
		}
		iteracoesFeitas = i;

		for (int w = 0; w < TAMANHOTESTE; w++) {
			m.Advance(leitor.getTesteEntrada()[w]);
		}
	}

	public static int teste() {
		int soma = 0;
		for (int w = 0; w < 86; w++) {
			m.Advance(leitor.getTesteEntrada()[w]);
			if (m.getOutPut(0) > 0.5) {
				soma++;
			}
		}
		return soma - 8;
	}

	public static double operar() {
		m.Advance(entradas);
		return m.getOutPut(0);
	}
}