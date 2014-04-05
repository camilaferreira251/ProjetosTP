/*Classe GameControler
 * Abcdário is free software: you can redistribute it and / or

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class GameController {

	private GamePersistence acessar = GamePersistence.getInstance();
	
	private String lista_num[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private String lista_letra[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
			"m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	
	public GameController(){}
	
	List<String> numero = new ArrayList<String>(Arrays.asList(lista_num));
	List<String> letra = new ArrayList<String>(Arrays.asList(lista_letra));
	
	public int[] getModelNumero(){
		
		Collections.shuffle(numero);
		
		GameModel modelo = acessar.getModelNumero((String) numero.get(0));
		
		int[] id = new int[2];
		
		id[0] = modelo.getImagem();
		id[1] = modelo.getBotao();
		
		return id;
	}
	
	public int getIdBotaoNumero(){
		
		Collections.shuffle(numero);
		
		GameModel modelo =  acessar.getModelNumero((String) numero.get(0));
		
		return modelo.getBotao();
	}
	
	public int[] getModelLetra(){
		
		Collections.shuffle(letra);
		
		GameModel modelo = acessar.getModelLetra((String) letra.get(0));
		
		int[] id = new int[2];
		
		id[0] = modelo.getImagem();
		id[1] = modelo.getBotao();
		
		return id;
	}
	
	public int getIdBotaoLetra(){
		
		Collections.shuffle(letra);
		
		GameModel modelo =  acessar.getModelLetra((String) letra.get(0));
		
		return modelo.getBotao();
	}
}
