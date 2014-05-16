/* Class LearnController
 * Abcdario is free software: you can redistribute it and / or

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

import jogo.LearnModel;
import jogo.LearnPersistence;

/*
 * This class was create to control the process of define an image and a audio 
 * to a letter and a number.
 */
public class LearnController {

	public LearnController() {
	}


	private LearnPersistence acess = LearnPersistence.getInstance();
	private LearnModel screen;


	// Defines an image and audio to the letter.
	public int[] defineLetter(String letter) {

		int id[] = new int[2];

		screen = acess.getModelLetter(letter);

		id[0] = screen.getImage();
		id[1] = screen.getAudio();

		return id;
	}

	// Defines an image and audio to the number
	public int[] defineNumber(String number) {

		int id[] = new int[2];

		screen = acess.getModelNumber(number);

		id[0] = screen.getImage();
		id[1] = screen.getAudio();

		return id;
	}

	// Returns the next letter
	public char nextLetter(char letter) {

		return 'a';
	}

	// Returns the previous letter
	public char previousLetter(char letter) {

		return 'a';
	}
}
