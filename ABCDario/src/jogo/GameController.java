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
	
	private String list_numbers[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private String list_letters[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
			"m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	
	public GameController(){}
	
	List<String> number = new ArrayList<String>(Arrays.asList(list_numbers));
	List<String> letter = new ArrayList<String>(Arrays.asList(list_letters));
	
	public int[] getModelNumero(){
		
		Collections.shuffle(number);
		
		GameModel modelo = acessar.getModelNumero((String) number.get(0));
		
		int[] id = new int[2];
		
		id[0] = modelo.getImage();
		id[1] = modelo.getButton();
		
		return id;
	}
	
	public int getIdBotaoNumero(){
		
		Collections.shuffle(number);
		
		GameModel modelo =  acessar.getModelNumero((String) number.get(0));
		
		return modelo.getButton();
	}
	
	public int[] getModelLetra(){
		
		Collections.shuffle(letter);
		
		GameModel modelo = acessar.getModelLetra((String) letter.get(0));
		
		int[] id = new int[2];
		
		id[0] = modelo.getImage();
		id[1] = modelo.getButton();
		
		return id;
	}
	
	public int getIdBotaoLetra(){
		
		Collections.shuffle(letter);
		
		GameModel modelo =  acessar.getModelLetra((String) letter.get(0));
		
		return modelo.getButton();
	}
}
