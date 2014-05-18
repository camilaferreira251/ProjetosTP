/*Class GamePersistence
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

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

import fga.mds.abcdario.R;

public class GamePersistence {

	// variable declaration to instantiate the object GamePersistence
	private static GamePersistence instance;

	// Declaring and instantiating an ArrayList that will contain all objects of
	// type GameModel related to numbers
	ArrayList<GameModel> registrationNumber = new ArrayList<GameModel>();
	ArrayList<GameModel> registrationLetter = new ArrayList<GameModel>();

	// Singleton pattern - Only one instance
	private GamePersistence() {
	}

	public static GamePersistence getInstance() {
		if (instance == null) {
			instance = new GamePersistence();
			instance.updatesRegister();
		} else {
			// nothing to do here
		}

		return instance;
	}

	// Whose method which will be called to initialize/update the registration
	public int updatesRegister() {
		int letter = 0;
		int number = 0;

		for (int i = 0; i < 26; i++) {
			GameModel instanceFirstChoiceLetter = instacesFirstChoiceLetter(letter);
			GameModel instanceSecondChoiceLetter = instancesSecondChoiceLetter(letter);
			GameModel instanceThirdChoiceLetter = instancesThirdChoiceLetter(letter);

			registrationLetter.add(instanceFirstChoiceLetter);
			registrationLetter.add(instanceSecondChoiceLetter);
			registrationLetter.add(instanceThirdChoiceLetter);

			letter++;
		}

		for (int i = 1; i <= 9; i++) {
			GameModel instanceFirstChoiceNumber = instancesFirstChoiceNumber(number);
			GameModel instanceSecondChoiceNumber = instancesSecondChoiceNumber(number);
			GameModel instanceThirdChoiceNumber = instancesThirdChoiceNumber(number);
			GameModel instanceFourthChoiceNumber = instacesFourthChoiceNumber(number);
			GameModel instanceFifthChoiceNumber = instancesFifthChoiceNumber(number);
			GameModel instanceSixthChoiceNumber = instancesSixthChoiceNumber(number);

			registrationNumber.add(instanceFirstChoiceNumber);
			registrationNumber.add(instanceSecondChoiceNumber);
			registrationNumber.add(instanceThirdChoiceNumber);
			registrationNumber.add(instanceFourthChoiceNumber);
			registrationNumber.add(instanceFifthChoiceNumber);
			registrationNumber.add(instanceSixthChoiceNumber);

			number++;
		}

		if (registrationLetter.isEmpty() || registrationNumber.isEmpty()) {
			return -1;
		} else {
			// nothing to do here
		}

		return 0;
	}

	// Declaring and instantiating objects of type GameModel related letters
	public GameModel instacesFirstChoiceLetter(int letter) {
	
		GameModel instancesOfChoiceLetter = null;

		switch (letter) {
		case 0:
			instancesOfChoiceLetter = new GameModel("a", R.drawable.letra_a_01,
					R.drawable.bt_a);
		case 1:
			instancesOfChoiceLetter = new GameModel("b", R.drawable.letra_b_01,
					R.drawable.bt_b);
		case 2:
			instancesOfChoiceLetter = new GameModel("c", R.drawable.letra_c_01,
					R.drawable.bt_c);
		case 3:
			instancesOfChoiceLetter = new GameModel("d", R.drawable.letra_d_01,
					R.drawable.bt_d);
		case 4:
			instancesOfChoiceLetter = new GameModel("e", R.drawable.letra_e_01,
					R.drawable.bt_e);
		case 5:
			instancesOfChoiceLetter = new GameModel("f", R.drawable.letra_f_01,
					R.drawable.bt_f);
		case 6:
			instancesOfChoiceLetter = new GameModel("g", R.drawable.letra_g_01,
					R.drawable.bt_g);
		case 7:
			instancesOfChoiceLetter = new GameModel("h", R.drawable.letra_h_01,
					R.drawable.bt_h);
		case 8:
			instancesOfChoiceLetter = new GameModel("i", R.drawable.letra_i_01,
					R.drawable.bt_i);
		case 9:
			instancesOfChoiceLetter = new GameModel("j", R.drawable.letra_j_01,
					R.drawable.bt_j);
		case 10:
			instancesOfChoiceLetter = new GameModel("k", R.drawable.letra_k_01,
					R.drawable.bt_k);
		case 11:
			instancesOfChoiceLetter = new GameModel("l", R.drawable.letra_l_01,
					R.drawable.bt_l);
		case 12:
			instancesOfChoiceLetter = new GameModel("m", R.drawable.letra_m_01,
					R.drawable.bt_m);
		case 13:
			instancesOfChoiceLetter = new GameModel("n", R.drawable.letra_n_01,
					R.drawable.bt_n);
		case 14:
			instancesOfChoiceLetter = new GameModel("o", R.drawable.letra_o_01,
					R.drawable.bt_o);
		case 15:
			instancesOfChoiceLetter = new GameModel("p", R.drawable.letra_p_01,
					R.drawable.bt_p);
		case 16:
			instancesOfChoiceLetter = new GameModel("q", R.drawable.letra_q_01,
					R.drawable.bt_q);
		case 17:
			instancesOfChoiceLetter = new GameModel("r", R.drawable.letra_r_01,
					R.drawable.bt_r);
		case 18:
			instancesOfChoiceLetter = new GameModel("s", R.drawable.letra_s_01,
					R.drawable.bt_s);
		case 19:
			instancesOfChoiceLetter = new GameModel("t", R.drawable.letra_t_01,
					R.drawable.bt_t);
		case 20:
			instancesOfChoiceLetter = new GameModel("u", R.drawable.letra_u_01,
					R.drawable.bt_u);
		case 21:
			instancesOfChoiceLetter = new GameModel("v", R.drawable.letra_v_01,
					R.drawable.bt_v);
		case 22:
			instancesOfChoiceLetter = new GameModel("w", R.drawable.letra_w_01,
					R.drawable.bt_w);
		case 23:
			instancesOfChoiceLetter = new GameModel("x", R.drawable.letra_x_01,
					R.drawable.bt_x);
		case 24:
			instancesOfChoiceLetter = new GameModel("y", R.drawable.letra_y_01,
					R.drawable.bt_y);
		case 25:
			instancesOfChoiceLetter = new GameModel("z", R.drawable.letra_z_01,
					R.drawable.bt_z);
		}
		return instancesOfChoiceLetter;
	}

	// Declaring and instantiating objects of type GameModel related letters
	public GameModel instancesSecondChoiceLetter(int letter) {
		GameModel instancesOfChoiceLetter = null;

		switch (letter) {
		case 0:
			instancesOfChoiceLetter = new GameModel("a", R.drawable.letra_a_02,
					R.drawable.bt_a);
		case 1:
			instancesOfChoiceLetter = new GameModel("b", R.drawable.letra_b_02,
					R.drawable.bt_b);
		case 2:
			instancesOfChoiceLetter = new GameModel("c", R.drawable.letra_c_02,
					R.drawable.bt_c);
		case 3:
			instancesOfChoiceLetter = new GameModel("d", R.drawable.letra_d_02,
					R.drawable.bt_d);
		case 4:
			instancesOfChoiceLetter = new GameModel("e", R.drawable.letra_e_02,
					R.drawable.bt_e);
		case 5:
			instancesOfChoiceLetter = new GameModel("f", R.drawable.letra_f_02,
					R.drawable.bt_f);
		case 6:
			instancesOfChoiceLetter = new GameModel("g", R.drawable.letra_g_02,
					R.drawable.bt_g);
		case 7:
			instancesOfChoiceLetter = new GameModel("h", R.drawable.letra_h_02,
					R.drawable.bt_h);
		case 8:
			instancesOfChoiceLetter = new GameModel("i", R.drawable.letra_i_02,
					R.drawable.bt_i);
		case 9:
			instancesOfChoiceLetter = new GameModel("j", R.drawable.letra_j_02,
					R.drawable.bt_j);
		case 10:
			instancesOfChoiceLetter = null;
		case 11:
			instancesOfChoiceLetter = new GameModel("l", R.drawable.letra_l_02,
					R.drawable.bt_l);
		case 12:
			instancesOfChoiceLetter = new GameModel("m", R.drawable.letra_m_01,
					R.drawable.bt_m);
		case 13:
			instancesOfChoiceLetter = new GameModel("n", R.drawable.letra_n_02,
					R.drawable.bt_n);
		case 14:
			instancesOfChoiceLetter = new GameModel("o", R.drawable.letra_o_02,
					R.drawable.bt_o);
		case 15:
			instancesOfChoiceLetter = new GameModel("p", R.drawable.letra_p_02,
					R.drawable.bt_p);
		case 16:
			instancesOfChoiceLetter = new GameModel("q", R.drawable.letra_q_02,
					R.drawable.bt_q);
		case 17:
			instancesOfChoiceLetter = new GameModel("r", R.drawable.letra_r_02,
					R.drawable.bt_r);
		case 18:
			instancesOfChoiceLetter = new GameModel("s", R.drawable.letra_s_02,
					R.drawable.bt_s);
		case 19:
			instancesOfChoiceLetter = new GameModel("t", R.drawable.letra_t_02,
					R.drawable.bt_t);
		case 20:
			instancesOfChoiceLetter = new GameModel("u", R.drawable.letra_u_02,
					R.drawable.bt_u);
		case 21:
			instancesOfChoiceLetter = new GameModel("v", R.drawable.letra_v_02,
					R.drawable.bt_v);
		case 22:
			instancesOfChoiceLetter = new GameModel("w", R.drawable.letra_w_02,
					R.drawable.bt_w);
		case 23:
			instancesOfChoiceLetter = new GameModel("x", R.drawable.letra_x_02,
					R.drawable.bt_x);
		case 24:
			instancesOfChoiceLetter = null;
		case 25:
			instancesOfChoiceLetter = new GameModel("z", R.drawable.letra_z_02,
					R.drawable.bt_z);
		}
		return instancesOfChoiceLetter;
	}

	// Declaring and instantiating objects of type GameModel related letters
	public GameModel instancesThirdChoiceLetter(int letter) {
		GameModel instancesOfChoiceLetter = null;

		switch (letter) {
		case 0:
			instancesOfChoiceLetter = new GameModel("a", R.drawable.letra_a_03,
					R.drawable.bt_a);
		case 1:
			instancesOfChoiceLetter = new GameModel("b", R.drawable.letra_b_03,
					R.drawable.bt_b);
		case 2:
			instancesOfChoiceLetter = new GameModel("c", R.drawable.letra_c_03,
					R.drawable.bt_c);
		case 3:
			instancesOfChoiceLetter = new GameModel("d", R.drawable.letra_d_03,
					R.drawable.bt_d);
		case 4:
			instancesOfChoiceLetter = new GameModel("e", R.drawable.letra_e_03,
					R.drawable.bt_e);
		case 5:
			instancesOfChoiceLetter = new GameModel("f", R.drawable.letra_f_03,
					R.drawable.bt_f);
		case 6:
			instancesOfChoiceLetter = new GameModel("g", R.drawable.letra_g_03,
					R.drawable.bt_g);
		case 7:
			instancesOfChoiceLetter = new GameModel("h", R.drawable.letra_h_03,
					R.drawable.bt_h);
		case 8:
			instancesOfChoiceLetter = new GameModel("i", R.drawable.letra_i_03,
					R.drawable.bt_i);
		case 9:
			instancesOfChoiceLetter = new GameModel("j", R.drawable.letra_j_03,
					R.drawable.bt_j);
		case 10:
			instancesOfChoiceLetter = null;
		case 11:
			instancesOfChoiceLetter = new GameModel("l", R.drawable.letra_l_03,
					R.drawable.bt_l);
		case 12:
			instancesOfChoiceLetter = new GameModel("m", R.drawable.letra_m_03,
					R.drawable.bt_m);
		case 13:
			instancesOfChoiceLetter = new GameModel("n", R.drawable.letra_n_03,
					R.drawable.bt_n);
		case 14:
			instancesOfChoiceLetter = new GameModel("o", R.drawable.letra_o_03,
					R.drawable.bt_o);
		case 15:
			instancesOfChoiceLetter = new GameModel("p", R.drawable.letra_p_03,
					R.drawable.bt_p);
		case 16:
			instancesOfChoiceLetter = new GameModel("q", R.drawable.letra_q_03,
					R.drawable.bt_q);
		case 17:
			instancesOfChoiceLetter = new GameModel("r", R.drawable.letra_r_03,
					R.drawable.bt_r);
		case 18:
			instancesOfChoiceLetter = new GameModel("s", R.drawable.letra_s_03,
					R.drawable.bt_s);
		case 19:
			instancesOfChoiceLetter = new GameModel("t", R.drawable.letra_t_03,
					R.drawable.bt_t);
		case 20:
			instancesOfChoiceLetter = new GameModel("u", R.drawable.letra_u_03,
					R.drawable.bt_u);
		case 21:
			instancesOfChoiceLetter = new GameModel("v", R.drawable.letra_v_03,
					R.drawable.bt_v);
		case 22:
			instancesOfChoiceLetter = null;
		case 23:
			instancesOfChoiceLetter = null;
		case 24:
			instancesOfChoiceLetter = null;
		case 25:
			instancesOfChoiceLetter = null;
		}
		return instancesOfChoiceLetter;
	}

	// Declaring and instantiating objects of type GameModel related to numbers
	private GameModel instancesFirstChoiceNumber(int number) {
		GameModel instancesOfChoiceNumber = null;
		switch (number) {
		case 1:
			instancesOfChoiceNumber = new GameModel("1", R.drawable.num_1_01,
					R.drawable.bt_1);
		case 2:
			instancesOfChoiceNumber = new GameModel("2", R.drawable.num_2_01,
					R.drawable.bt_2);
		case 3:
			instancesOfChoiceNumber = new GameModel("3", R.drawable.num_3_01,
					R.drawable.bt_3);
		case 4:
			instancesOfChoiceNumber = new GameModel("4", R.drawable.num_4_01,
					R.drawable.bt_4);
		case 5:
			instancesOfChoiceNumber = new GameModel("5", R.drawable.num_5_01,
					R.drawable.bt_5);
		case 6:
			instancesOfChoiceNumber = new GameModel("6", R.drawable.num_6_01,
					R.drawable.bt_6);
		case 7:
			instancesOfChoiceNumber = new GameModel("7", R.drawable.num_7_01,
					R.drawable.bt_7);
		case 8:
			instancesOfChoiceNumber = new GameModel("8", R.drawable.num_8_01,
					R.drawable.bt_8);
		case 9:
			instancesOfChoiceNumber = new GameModel("9", R.drawable.num_9_01,
					R.drawable.bt_9);
		}
		return instancesOfChoiceNumber;
	}

	// Declaring and instantiating objects of type GameModel related to numbers
	private GameModel instancesSecondChoiceNumber(int number) {
		GameModel instancesOfChoiceNumber = null;
		switch (number) {
		case 1:
			instancesOfChoiceNumber = new GameModel("1", R.drawable.num_1_02,
					R.drawable.bt_1);
		case 2:
			instancesOfChoiceNumber = new GameModel("2", R.drawable.num_2_02,
					R.drawable.bt_2);
		case 3:
			instancesOfChoiceNumber = new GameModel("3", R.drawable.num_3_02,
					R.drawable.bt_3);
		case 4:
			instancesOfChoiceNumber = null;
		case 5:
			instancesOfChoiceNumber = new GameModel("5", R.drawable.num_5_02,
					R.drawable.bt_5);
		case 6:
			instancesOfChoiceNumber = new GameModel("6", R.drawable.num_6_02,
					R.drawable.bt_6);
		case 7:
			instancesOfChoiceNumber = new GameModel("7", R.drawable.num_7_02,
					R.drawable.bt_7);
		case 8:
			instancesOfChoiceNumber = new GameModel("8", R.drawable.num_8_02,
					R.drawable.bt_8);
		case 9:
			instancesOfChoiceNumber = new GameModel("9", R.drawable.num_9_02,
					R.drawable.bt_9);
		}
		return instancesOfChoiceNumber;
	}

	// Declaring and instantiating objects of type GameModel related to numbers
	private GameModel instancesThirdChoiceNumber(int number) {
		GameModel instancesOfChoiceNumber = null;
		switch (number) {
		case 1:
			instancesOfChoiceNumber = new GameModel("1", R.drawable.num_1_03,
					R.drawable.bt_1);
		case 2:
			instancesOfChoiceNumber = new GameModel("2", R.drawable.num_2_03,
					R.drawable.bt_2);
		case 3:
			instancesOfChoiceNumber = new GameModel("3", R.drawable.num_3_03,
					R.drawable.bt_3);
		case 4:
			instancesOfChoiceNumber = new GameModel("4", R.drawable.num_4_03,
					R.drawable.bt_4);
		case 5:
			instancesOfChoiceNumber = new GameModel("5", R.drawable.num_5_03,
					R.drawable.bt_5);
		case 6:
			instancesOfChoiceNumber = new GameModel("6", R.drawable.num_6_03,
					R.drawable.bt_6);
		case 7:
			instancesOfChoiceNumber = new GameModel("7", R.drawable.num_7_03,
					R.drawable.bt_7);
		case 8:
			instancesOfChoiceNumber = new GameModel("8", R.drawable.num_8_03,
					R.drawable.bt_8);
		case 9:
			instancesOfChoiceNumber = new GameModel("9", R.drawable.num_9_03,
					R.drawable.bt_9);
		}
		return instancesOfChoiceNumber;
	}

	// Declaring and instantiating objects of type GameModel related to numbers
	private GameModel instacesFourthChoiceNumber(int number) {
		GameModel instancesOfChoiceNumber = null;
		switch (number) {
		case 1:
			instancesOfChoiceNumber = new GameModel("1", R.drawable.num_1_04,
					R.drawable.bt_1);
		case 2:
			instancesOfChoiceNumber = new GameModel("2", R.drawable.num_2_04,
					R.drawable.bt_2);
		case 3:
			instancesOfChoiceNumber = new GameModel("3", R.drawable.num_3_04,
					R.drawable.bt_3);
		case 4:
			instancesOfChoiceNumber = new GameModel("4", R.drawable.num_4_04,
					R.drawable.bt_4);
		case 5:
			instancesOfChoiceNumber = new GameModel("5", R.drawable.num_5_04,
					R.drawable.bt_5);
		case 6:
			instancesOfChoiceNumber = new GameModel("6", R.drawable.num_6_04,
					R.drawable.bt_6);
		case 7:
			instancesOfChoiceNumber = new GameModel("7", R.drawable.num_7_04,
					R.drawable.bt_7);
		case 8:
			instancesOfChoiceNumber = new GameModel("8", R.drawable.num_8_04,
					R.drawable.bt_8);
		case 9:
			instancesOfChoiceNumber = new GameModel("9", R.drawable.num_9_04,
					R.drawable.bt_9);
		}
		return instancesOfChoiceNumber;
	}

	// Declaring and instantiating objects of type GameModel related to numbers
	private GameModel instancesFifthChoiceNumber(int number) {
		GameModel instancesOfChoiceNumber = null;
		switch (number) {
		case 1:
			instancesOfChoiceNumber = new GameModel("1", R.drawable.num_1_05,
					R.drawable.bt_1);
		case 2:
			instancesOfChoiceNumber = new GameModel("2", R.drawable.num_2_05,
					R.drawable.bt_2);
		case 3:
			instancesOfChoiceNumber = new GameModel("3", R.drawable.num_3_05,
					R.drawable.bt_3);
		case 4:
			instancesOfChoiceNumber = new GameModel("4", R.drawable.num_4_05,
					R.drawable.bt_4);
		case 5:
			instancesOfChoiceNumber = new GameModel("5", R.drawable.num_5_05,
					R.drawable.bt_5);
		case 6:
			instancesOfChoiceNumber = new GameModel("6", R.drawable.num_6_05,
					R.drawable.bt_6);
		case 7:
			instancesOfChoiceNumber = new GameModel("7", R.drawable.num_7_05,
					R.drawable.bt_7);
		case 8:
			instancesOfChoiceNumber = new GameModel("8", R.drawable.num_8_05,
					R.drawable.bt_8);
		case 9:
			instancesOfChoiceNumber = new GameModel("9", R.drawable.num_9_05,
					R.drawable.bt_9);
		}
		return instancesOfChoiceNumber;
	}

	// Declaring and instantiating objects of type GameModel related to numbers
	private GameModel instancesSixthChoiceNumber(int number) {
		GameModel instancesOfChoiceNumber = null;
		switch (number) {
		case 1:
			instancesOfChoiceNumber = new GameModel("1", R.drawable.num_1_06,
					R.drawable.bt_1);
		case 2:
			instancesOfChoiceNumber = new GameModel("2", R.drawable.num_2_06,
					R.drawable.bt_2);
		case 3:
			instancesOfChoiceNumber = new GameModel("3", R.drawable.num_3_06,
					R.drawable.bt_3);
		case 4:
			instancesOfChoiceNumber = new GameModel("4", R.drawable.num_4_06,
					R.drawable.bt_4);
		case 5:
			instancesOfChoiceNumber = new GameModel("5", R.drawable.num_5_06,
					R.drawable.bt_5);
		case 6:
			instancesOfChoiceNumber = new GameModel("6", R.drawable.num_6_06,
					R.drawable.bt_6);
		case 7:
			instancesOfChoiceNumber = new GameModel("7", R.drawable.num_7_06,
					R.drawable.bt_7);
		case 8:
			instancesOfChoiceNumber = new GameModel("8", R.drawable.num_8_06,
					R.drawable.bt_8);
		case 9:
			instancesOfChoiceNumber = new GameModel("9", R.drawable.num_9_06,
					R.drawable.bt_9);
		}
		return instancesOfChoiceNumber;
	}

	// Function to return object of type GameModel from sending a desired number
	public GameModel getModelNumero(String number) {

		Iterator<GameModel> i = registrationNumber.iterator();

		Collections.shuffle(registrationNumber);

		while (i.hasNext()) {

			GameModel jm = (GameModel) i.next();

			String name = jm.getName();

			if (name.equalsIgnoreCase(number)) {
				return jm;
			} else {
				// nothing to do here
			}
		}

		return null;
	}

	// Function to return object of type GameModel from sending a letter desired
	public GameModel getModelLetra(String letter) {

		Iterator<GameModel> i = registrationLetter.iterator();

		Collections.shuffle(registrationLetter);

		while (i.hasNext()) {

			GameModel jm = (GameModel) i.next();

			String name = jm.getName();

			if (name.equalsIgnoreCase(letter)) {
				return jm;
			} else {
				// nothing to do here
			}
		}

		return null;
	}
}
