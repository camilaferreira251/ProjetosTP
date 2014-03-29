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
	// type
	// GameModel related to numbers
	ArrayList<GameModel> registrationNumber = new ArrayList<GameModel>();
	ArrayList<GameModel> registrationLetter = new ArrayList<GameModel>();

	// Singleton pattern - Only one instance
	private GamePersistence() {
	}

	public static GamePersistence getInstance() {
		if (instance == null) {
			instance = new GamePersistence();
			instance.updatesRegister();
		}
		return instance;
	}

	// whose method which will be called to initialize / update the registration
	public int updatesRegister(){
		
		//Declaring and instantiating objects of type GameModel related letters
		GameModel firstChoiceLetterA = new GameModel("a", R.drawable.letra_a_01, R.drawable.bt_a); 
		GameModel secondChoiceLetterA = new GameModel("a", R.drawable.letra_a_02, R.drawable.bt_a); 
		GameModel thirdChoiceLetterA = new GameModel("a", R.drawable.letra_a_03, R.drawable.bt_a); 
		
		GameModel firstChoiceLetterB = new GameModel("b", R.drawable.letra_b_01, R.drawable.bt_b); 
		GameModel secondChoiceLetterB = new GameModel("b", R.drawable.letra_b_02, R.drawable.bt_b); 
		GameModel thirdChoiceLetterB = new GameModel("b", R.drawable.letra_b_03, R.drawable.bt_b); 
		
		GameModel firstChoiceLetterC = new GameModel("c", R.drawable.letra_c_01, R.drawable.bt_c);
		GameModel secondChoiceLetterC = new GameModel("c", R.drawable.letra_c_02, R.drawable.bt_c);
		GameModel thirdChoiceLetterC = new GameModel("c", R.drawable.letra_c_03, R.drawable.bt_c);
		GameModel fourthChoiceLetterC = new GameModel("c", R.drawable.letra_c_04, R.drawable.bt_c);
		
		GameModel firstChoiceLetterD = new GameModel("d", R.drawable.letra_d_01, R.drawable.bt_d); 
		GameModel secondChoiceLetterD = new GameModel("d", R.drawable.letra_d_02, R.drawable.bt_d); 
		GameModel thirdChoiceLetterD = new GameModel("d", R.drawable.letra_d_03, R.drawable.bt_d); 
		
		GameModel firstChoiceLetterE = new GameModel("e", R.drawable.letra_e_01, R.drawable.bt_e); 
		GameModel secondChoiceLetterE = new GameModel("e", R.drawable.letra_e_02, R.drawable.bt_e);
		GameModel thirdChoiceLetterE = new GameModel("e", R.drawable.letra_e_03, R.drawable.bt_e);
		
		GameModel firstChoiceLetterF = new GameModel("f", R.drawable.letra_f_01, R.drawable.bt_f); 
		GameModel secondChoiceLetterF = new GameModel("f", R.drawable.letra_f_02, R.drawable.bt_f);
		GameModel thirdChoiceLetterF = new GameModel("f", R.drawable.letra_f_03, R.drawable.bt_f);
		
		JogoModel firstChoiceLetterG = new GameModel("g", R.drawable.letra_g_01, R.drawable.bt_g); 
		JogoModel secondChoiceLetterG = new GameModel("g", R.drawable.letra_g_02, R.drawable.bt_g);
		JogoModel thirdChoiceLetterG = new GameModel("g", R.drawable.letra_g_03, R.drawable.bt_g);
		
		GameModel firstChoiceLetterH = new GameModel("h", R.drawable.letra_h_01, R.drawable.bt_h);
		GameModel secondChoiceLetterH = new GameModel("h", R.drawable.letra_h_02, R.drawable.bt_h);
		GameModel thirdChoiceLetterH = new GameModel("h", R.drawable.letra_h_03, R.drawable.bt_h);
		
		GameModel firstChoiceLetterI = new GameModel("i", R.drawable.letra_i_01, R.drawable.bt_i); 
		GameModel secondChoiceLetterI = new GameModel("i", R.drawable.letra_i_02, R.drawable.bt_i); 
		GameModel thirdChoiceLetterI = new GameModel("i", R.drawable.letra_i_03, R.drawable.bt_i); 
		
		GameModel firstChoiceLetterJ = new GameModel("j", R.drawable.letra_j_01, R.drawable.bt_j);
		GameModel secondChoiceLetterJ = new GameModel("j", R.drawable.letra_j_02, R.drawable.bt_j);
		GameModel thirdChoiceLetterJ = new GameModel("j", R.drawable.letra_j_03, R.drawable.bt_j);
		
		GameModel firstChoiceLetterK = new GameModel("k", R.drawable.letra_k_01, R.drawable.bt_k); 
		
		GameModel firstChoiceLetterL = new GameModel("l", R.drawable.letra_l_01, R.drawable.bt_l); 
		GameModel secondChoiceLetterL = new GameModel("l", R.drawable.letra_l_02, R.drawable.bt_l); 
		GameModel thirdChoiceLetterL = new GameModel("l", R.drawable.letra_l_03, R.drawable.bt_l); 
		
		GameModel firstChoiceLetterM = new GameModel("m", R.drawable.letra_m_01, R.drawable.bt_m);
		GameModel secondChoiceLetterM = new GameModel("m", R.drawable.letra_m_02, R.drawable.bt_m);
		GameModel thirdChoiceLetterM = new GameModel("m", R.drawable.letra_m_03, R.drawable.bt_m);
		
		GameModel firstChoiceLetterN = new GameModel("n", R.drawable.letra_n_01, R.drawable.bt_n); 
		GameModel secondChoiceLetterN = new GameModel("n", R.drawable.letra_n_02, R.drawable.bt_n); 
		GameModel thirdChoiceLetterN = new GameModel("n", R.drawable.letra_n_03, R.drawable.bt_n); 
		
		GameModel firstChoiceLetterO = new GameModel("o", R.drawable.letra_o_01, R.drawable.bt_o); 
		GameModel secondChoiceLetterO = new GameModel("o", R.drawable.letra_o_02, R.drawable.bt_o); 
		GameModel thirdChoiceLetterO = new GameModel("o", R.drawable.letra_o_03, R.drawable.bt_o); 
		
		GameModel firstChoiceLetterP = new GameModel("p", R.drawable.letra_p_01, R.drawable.bt_p); 
		GameModel secondChoiceLetterP = new GameModel("p", R.drawable.letra_p_02, R.drawable.bt_p); 
		GameModel thirdChoiceLetterP = new GameModel("p", R.drawable.letra_p_03, R.drawable.bt_p); 
		
		GameModel firstChoiceLetterQ = new GameModel("q", R.drawable.letra_q_01, R.drawable.bt_q); 
		GameModel secondChoiceLetterQ = new GameModel("q", R.drawable.letra_q_02, R.drawable.bt_q); 
		GameModel thirdChoiceLetterQ = new GameModel("q", R.drawable.letra_q_03, R.drawable.bt_q); 
		
		GameModel firstChoiceLetterR = new GameModel("r", R.drawable.letra_r_01, R.drawable.bt_r);
		GameModel secondChoiceLetterR = new GameModel("r", R.drawable.letra_r_02, R.drawable.bt_r);
		GameModel thirdChoiceLetterR = new GameModel("r", R.drawable.letra_r_03, R.drawable.bt_r);
		
		GameModel firstChoiceLetterS = new GameModel("s", R.drawable.letra_s_01, R.drawable.bt_s);
		GameModel secondChoiceLetterS = new GameModel("s", R.drawable.letra_s_02, R.drawable.bt_s);
		GameModel thirdChoiceLetterS = new GameModel("s", R.drawable.letra_s_03, R.drawable.bt_s);
		
		GameModel firstChoiceLetterT = new GameModel("t", R.drawable.letra_t_01, R.drawable.bt_t); 
		GameModel secondChoiceLetterT = new GameModel("t", R.drawable.letra_t_02, R.drawable.bt_t); 
		GameModel ThirdChoiceLetterT = new GameModel("t", R.drawable.letra_t_03, R.drawable.bt_t); 
		
		GameModel firstChoiceLetterU = new GameModel("u", R.drawable.letra_u_01, R.drawable.bt_u);
		GameModel secondChoiceLetterU = new GameModel("u", R.drawable.letra_u_02, R.drawable.bt_u);
		GameModel thirdChoiceLetterU = new GameModel("u", R.drawable.letra_u_03, R.drawable.bt_u);
		
		GameModel firstChoiceLetterV = new GameModel("v", R.drawable.letra_v_01, R.drawable.bt_v);
		GameModel secondChoiceLetterV = new GameModel("v", R.drawable.letra_v_02, R.drawable.bt_v);
		GameModel thirdChoiceLetterV = new GameModel("v", R.drawable.letra_v_03, R.drawable.bt_v);
		
		GameModel firstChoiceLetterW = new GameModel("w", R.drawable.letra_w_01, R.drawable.bt_w); 
		GameModel secondChoiceLetterW = new GameModel("w", R.drawable.letra_w_02, R.drawable.bt_w); 
		
		GameModel firstChoiceLetterX = new GameModel("x", R.drawable.letra_x_01, R.drawable.bt_x);
		GameModel secondChoiceLetterX = new GameModel("x", R.drawable.letra_x_02, R.drawable.bt_x);
		
		GameModel firstChoiceLetterY = new GameModel("y", R.drawable.letra_y_01, R.drawable.bt_y);
		
		GameModel firstChoiceLetterZ = new GameModel("z", R.drawable.letra_z_01, R.drawable.bt_z);
		GameModel secondChoiceLetterZ = new GameModel("z", R.drawable.letra_z_02, R.drawable.bt_z);
		
	
		//Declaring and instantiating objects of type GameModel related to numbers
		GameModel firstChoiceNumber1 = new GameModel("1",R.drawable.num_1_01, R.drawable.bt_1 );
		GameModel secondChoiceNumber1 = new GameModel("1",R.drawable.num_1_02, R.drawable.bt_1 );
		GameModel thirdChoiceNumber1 = new GameModel("1",R.drawable.num_1_03, R.drawable.bt_1 );
		GameModel fourthChoiceNumber1 = new GameModel("1",R.drawable.num_1_04, R.drawable.bt_1 );
		GameModel fifthChoiceNumber1 = new GameModel("1",R.drawable.num_1_05, R.drawable.bt_1 );
		GameModel sixthChoiceNumber1 = new GameModel("1",R.drawable.num_1_06, R.drawable.bt_1 );
	
		GameModel firstChoiceNumber2 = new GameModel("2",R.drawable.num_2_01, R.drawable.bt_2 );
		GameModel secondChoiceNumber2 = new GameModel("2",R.drawable.num_2_02, R.drawable.bt_2 );
		GameModel thirdChoiceNumber2 = new GameModel("2",R.drawable.num_2_03, R.drawable.bt_2 );
		GameModel fourthChoiceNumber2 = new GameModel("2",R.drawable.num_2_04, R.drawable.bt_2 );
		GameModel fifthChoiceNumber2 = new GameModel("2",R.drawable.num_2_05, R.drawable.bt_2 );
		GameModel sixthChoiceNumber2 = new GameModel("2",R.drawable.num_2_06, R.drawable.bt_2 );
	
		GameModel firstChoiceNumber3 = new GameModel("3",R.drawable.num_3_01, R.drawable.bt_3 );	
		GameModel secondChoiceNumber3 = new GameModel("3",R.drawable.num_3_02, R.drawable.bt_3 );
		GameModel thirdChoiceNumber3 = new GameModel("3",R.drawable.num_3_03, R.drawable.bt_3 );
		GameModel fourthChoiceNumber3 = new GameModel("3",R.drawable.num_3_04, R.drawable.bt_3 );
		GameModel fifthChoiceNumber3 = new GameModel("3",R.drawable.num_3_05, R.drawable.bt_3 );
		GameModel sixthChoiceNumber3 = new GameModel("3",R.drawable.num_3_06, R.drawable.bt_3 );
	
		GameModel firstChoiceNumber4 = new GameModel("4",R.drawable.num_4_01, R.drawable.bt_4 );
		GameModel thirdChoiceNumber4 = new GameModel("4",R.drawable.num_4_03, R.drawable.bt_4 );
		GameModel fourthChoiceNumber4 = new GameModel("4",R.drawable.num_4_04, R.drawable.bt_4 );
		GameModel fifthChoiceNumber4 = new GameModel("4",R.drawable.num_4_05, R.drawable.bt_4 );
		GameModel sixthChoiceNumber4 = new GameModel("4",R.drawable.num_4_06, R.drawable.bt_4 );
	
		GameModel firstChoiceNumber5 = new GameModel("5",R.drawable.num_5_01, R.drawable.bt_5 );
		GameModel secondChoiceNumber5 = new GameModel("5",R.drawable.num_5_02, R.drawable.bt_5 );
		GameModel thirdChoiceNumber5 = new GameModel("5",R.drawable.num_5_03, R.drawable.bt_5 );
		GameModel fourthChoiceNumber5 = new GameModel("5",R.drawable.num_5_04, R.drawable.bt_5 );
		GameModel fifthChoiceNumber5 = new GameModel("5",R.drawable.num_5_05, R.drawable.bt_5 );
		GameModel sixthChoiceNumber5 = new GameModel("5",R.drawable.num_5_06, R.drawable.bt_5 );
	
		GameModel firstChoiceNumber6 = new GameModel("6",R.drawable.num_6_01, R.drawable.bt_6 );
		GameModel secondChoiceNumber6 = new GameModel("6",R.drawable.num_6_02, R.drawable.bt_6 );
		GameModel thirdChoiceNumber6 = new GameModel("6",R.drawable.num_6_03, R.drawable.bt_6 );
		GameModel fourthChoiceNumber6 = new GameModel("6",R.drawable.num_6_04, R.drawable.bt_6 );
		GameModel fifthChoiceNumber6 = new GameModel("6",R.drawable.num_6_05, R.drawable.bt_6 );
		GameModel sixthChoiceNumber6 = new GameModel("6",R.drawable.num_6_06, R.drawable.bt_6 );
	
		GameModel firstChoiceNumber7 = new GameModel("7",R.drawable.num_7_01, R.drawable.bt_7 );
		GameModel secondChoiceNumber7 = new GameModel("7",R.drawable.num_7_02, R.drawable.bt_7 );
		GameModel thirdChoiceNumber7 = new GameModel("7",R.drawable.num_7_03, R.drawable.bt_7 );
		GameModel fourthChoiceNumber7 = new GameModel("7",R.drawable.num_7_04, R.drawable.bt_7 );
		GameModel fifthChoiceNumber7 = new GameModel("7",R.drawable.num_7_05, R.drawable.bt_7 );
		GameModel sixthChoiceNumber7 = new GameModel("7",R.drawable.num_7_06, R.drawable.bt_7 );
	
		GameModel FirstChoiceNumber8 = new GameModel("8",R.drawable.num_8_01, R.drawable.bt_8 );
		GameModel secondChoiceNumber8 = new GameModel("8",R.drawable.num_8_02, R.drawable.bt_8 );
		GameModel thirdChoiceNumber8 = new GameModel("8",R.drawable.num_8_03, R.drawable.bt_8 );
		GameModel fourthChoiceNumber8 = new GameModel("8",R.drawable.num_8_04, R.drawable.bt_8 );
		GameModel fifthChoiceNumber8 = new GameModel("8",R.drawable.num_8_05, R.drawable.bt_8 );
		GameModel sixthChoiceNumber8 = new GameModel("8",R.drawable.num_8_06, R.drawable.bt_8 );
	
		GameModel firstChoiceNumber9 = new GameModel("9",R.drawable.num_9_01, R.drawable.bt_9 );
		GameModel secondChoiceNumber9 = new GameModel("9",R.drawable.num_9_02, R.drawable.bt_9 );
		GameModel thirdChoiceNumber9 = new GameModel("9",R.drawable.num_9_03, R.drawable.bt_9 );
		GameModel fourthChoiceNumber9 = new GameModel("9",R.drawable.num_9_04, R.drawable.bt_9 );
		GameModel fifthChoiceNumber9 = new GameModel("9",R.drawable.num_9_05, R.drawable.bt_9 );
		GameModel sixthChoiceNumber9 = new GameModel("9",R.drawable.num_9_06, R.drawable.bt_9 );
	
		//storing the registrationLetter
		cadastroLetra.add(firstChoiceLetterA);
		cadastroLetra.add(secondChoiceLetterA);
		cadastroLetra.add(thirdChoiceLetterA);
		
		cadastroLetra.add(firstChoiceLetterB);
		cadastroLetra.add(secondChoiceLetterB);
		cadastroLetra.add(thirdChoiceLetterB);
		
		cadastroLetra.add(firstChoiceLetterC);
		cadastroLetra.add(secondChoiceLetterC);
		cadastroLetra.add(thirdChoiceLetterC);
		cadastroLetra.add(fourthChoiceLetterC);
		
		cadastroLetra.add(firstChoiceLetterD);
		cadastroLetra.add(secondChoiceLetterD);
		cadastroLetra.add(thirdChoiceLetterD);
		
		cadastroLetra.add(firstChoiceLetterE);
		cadastroLetra.add(secondChoiceLetterE);
		cadastroLetra.add(thirdChoiceLetterE);
		
		cadastroLetra.add(firstChoiceLetterF);
		cadastroLetra.add(secondChoiceLetterF);
		cadastroLetra.add(thirdChoiceLetterF);
		
		cadastroLetra.add(firstChoiceLetterG);
		cadastroLetra.add(secondChoiceLetterG);
		cadastroLetra.add(thirdChoiceLetterG);
		
		cadastroLetra.add(firstChoiceLetterH);
		cadastroLetra.add(secondChoiceLetterH);
		cadastroLetra.add(thirdChoiceLetterH);
		
		cadastroLetra.add(firstChoiceLetterI);
		cadastroLetra.add(secondChoiceLetterI);
		cadastroLetra.add(thirdChoiceLetterI);
		
		cadastroLetra.add(firstChoiceLetterJ);
		cadastroLetra.add(secondChoiceLetterJ);
		cadastroLetra.add(thirdChoiceLetterJ);
		
		cadastroLetra.add(firstChoiceLetterK);
		
		cadastroLetra.add(firstChoiceLetterL);
		cadastroLetra.add(secondChoiceLetterL);
		cadastroLetra.add(thirdChoiceLetterL);
		
		cadastroLetra.add(firstChoiceLetterM);
		cadastroLetra.add(secondChoiceLetterM);
		cadastroLetra.add(thirdChoiceLetterM);
		
		cadastroLetra.add(firstChoiceLetterN);
		cadastroLetra.add(secondChoiceLetterN);
		cadastroLetra.add(thirdChoiceLetterN);
		
		cadastroLetra.add(firstChoiceLetterO);
		cadastroLetra.add(secondChoiceLetterO);
		cadastroLetra.add(thirdChoiceLetterO);
		
		cadastroLetra.add(firstChoiceLetterP);
		cadastroLetra.add(secondChoiceLetterP);
		cadastroLetra.add(thirdChoiceLetterP);
		
		cadastroLetra.add(firstChoiceLetterQ);
		cadastroLetra.add(secondChoiceLetterQ);
		cadastroLetra.add(thirdChoiceLetterQ);
		
		cadastroLetra.add(firstChoiceLetterR);
		cadastroLetra.add(secondChoiceLetterR);
		cadastroLetra.add(thirdChoiceLetterR);
		
		cadastroLetra.add(firstChoiceLetterS);
		cadastroLetra.add(secondChoiceLetterS);
		cadastroLetra.add(thirdChoiceLetterS);
		
		cadastroLetra.add(firstChoiceLetterT);
		cadastroLetra.add(secondChoiceLetterT);
		cadastroLetra.add(thirdChoiceLetterT);
		
		cadastroLetra.add(firstChoiceLetterU);
		cadastroLetra.add(secondChoiceLetterU);
		cadastroLetra.add(thirdChoiceLetterU);
		
		cadastroLetra.add(firstChoiceLetterV);
		cadastroLetra.add(secondChoiceLetterV);
		cadastroLetra.add(ThirdChoiceLetterV);
		
		cadastroLetra.add(firstChoiceLetterW);
		cadastroLetra.add(secondChoiceLetterW);
		
		cadastroLetra.add(firstChoiceLetterX);
		cadastroLetra.add(secondChoiceLetterX);
		
		cadastroLetra.add(firstChoiceLetterY);
		
		cadastroLetra.add(firstChoiceLetterZ);
		cadastroLetra.add(secondChoiceLetterZ);
		
		//Storing the registrationNumber
		cadastroNumero.add(firstChoiceNumber1);
		cadastroNumero.add(secondChoiceNumber1);
		cadastroNumero.add(thirdChthirdNumber1);
		cadastroNumero.add(fourthChoiceNumber1);
		cadastroNumero.add(fifthChoiceNumber1);
		cadastroNumero.add(sixthChoiceNumber1);
	
		cadastroNumero.add(firstChoiceNumber2);
		cadastroNumero.add(secondChoiceNumber2);
		cadastroNumero.add(thirdChoiceNumber2);
		cadastroNumero.add(fourthChoiceNumber2);
		cadastroNumero.add(fifthChoiceNumber2);
		cadastroNumero.add(sixthChoiceNumber2);
	
		cadastroNumero.add(firstChoiceNumber3);
		cadastroNumero.add(secondChoiceNumber3);
		cadastroNumero.add(thirdChoiceNumber3);
		cadastroNumero.add(fourthChoiceNumber3);
		cadastroNumero.add(fifthChoiceNumber3);
		cadastroNumero.add(sixthChoiceNumber3);
	
		cadastroNumero.add(firstChoiceNumber4);
		cadastroNumero.add(thirdChoiceNumber4);
		cadastroNumero.add(fourthChoiceNumber4);
		cadastroNumero.add(fifthChoiceNumber4);
		cadastroNumero.add(sixthChoiceNumber4);
	
		cadastroNumero.add(firstChoiceNumber5);
		cadastroNumero.add(secondChoiceNumber5);
		cadastroNumero.add(thirdChoiceNumber5);
		cadastroNumero.add(fourthChoiceNumber5);
		cadastroNumero.add(fifthChoiceNumber5);
		cadastroNumero.add(sixthChoiceNumber5);
	
		cadastroNumero.add(firstChoiceNumber6);
		cadastroNumero.add(secondChoiceNumber6);
		cadastroNumero.add(thirdChoiceNumber6);
		cadastroNumero.add(fourthChoiceNumber6);
		cadastroNumero.add(fifthChoiceNumber6);
		cadastroNumero.add(sixthChoiceNumber6);
	
		cadastroNumero.add(firstChoiceNumber7);
		cadastroNumero.add(secondChoiceNumber7);
		cadastroNumero.add(thirdChoiceNumber7);
		cadastroNumero.add(fourthChoiceNumber7);
		cadastroNumero.add(fifthChoiceNumber7);
		cadastroNumero.add(sixthChoiceNumber7);
	
		cadastroNumero.add(FirstChoiceNumber8);
		cadastroNumero.add(secondChoiceNumber8);
		cadastroNumero.add(thirdChoiceNumber8);
		cadastroNumero.add(fourthChoiceNumber8);
		cadastroNumero.add(fifthChoiceNumber8);
		cadastroNumero.add(sixthChoiceNumber8);
	
		cadastroNumero.add(firstChoiceNumber9);
		cadastroNumero.add(secondChoiceNumber9);
		cadastroNumero.add(thirdChoiceNumber9);
		cadastroNumero.add(fourthChoiceNumber9);
		cadastroNumero.add(fifthChoiceNumber9);
		cadastroNumero.add(sixthChoiceNumber9);
	
		//verification
		if(cadastroLetra.isEmpty() || cadastroNumero.isEmpty())
			return -1;
		
		return 0;
	}

	// Function to return object of type GameModel from sending a desired number
	public GameModel getModelNumero(String numero) {

		Iterator<GameModel> i = cadastroNumero.iterator();

		Collections.shuffle(cadastroNumero);

		while (i.hasNext()) {

			GameModel jm = (GameModel) i.next();

			String nome = jm.getNome();

			if (nome.equalsIgnoreCase(numero))
				return jm;
		}

		return null;
	}

	// Function to return object of type GameModel from sending a letter desired
	public GameModel getModelLetra(String letra) {

		Iterator<GameModel> i = cadastroLetra.iterator();

		Collections.shuffle(cadastroLetra);

		while (i.hasNext()) {

			GameModel jm = (GameModel) i.next();

			String nome = jm.getNome();

			if (nome.equalsIgnoreCase(letra)) {

				return jm;
			}
		}

		return null;
	}
}
