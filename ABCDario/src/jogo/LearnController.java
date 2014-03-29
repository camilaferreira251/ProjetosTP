/*Classe LearnController
 * Abcd�rio is free software: you can redistribute it and / or

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

package jogo; 

public class LearnController {

	public LearnController() {
	}

	private AprenderPersistencia acessar = AprenderPersistencia.getInstance();
	private LearnModel tela;

	public int[] definirLetra(String letra) {

		int id[] = new int[2];

		tela = acessar.getModelLetra(letra);

		id[0] = tela.getImagem();
		id[1] = tela.getAudio();

		return id;
	}

	public int[] definirNumero(String numero) {

		int id[] = new int[2];

		tela = acessar.getModelNumero(numero);

		id[0] = tela.getImagem();
		id[1] = tela.getAudio();

		return id;
	}

	public char proximaLetra(char letra) {

		return 'a';
	}

	public char anteriorLetra(char letra) {

		return 'a';
	}
}
