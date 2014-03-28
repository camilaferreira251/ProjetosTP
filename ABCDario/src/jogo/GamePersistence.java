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
	ArrayList<JogoModel> registrationNumber = new ArrayList<JogoModel>();
	ArrayList<JogoModel> registrationLetter = new ArrayList<JogoModel>();

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
		JogoModel firstChoiceLetterA = new JogoModel("a", R.drawable.letra_a_01, R.drawable.bt_a); 
		JogoModel secondChoiceLetterA = new JogoModel("a", R.drawable.letra_a_02, R.drawable.bt_a); 
		JogoModel thirdChoiceLetterA = new JogoModel("a", R.drawable.letra_a_03, R.drawable.bt_a); 
		
		JogoModel firstChoiceLetterB = new JogoModel("b", R.drawable.letra_b_01, R.drawable.bt_b); 
		JogoModel secondChoiceLetterB = new JogoModel("b", R.drawable.letra_b_02, R.drawable.bt_b); 
		JogoModel thirdChoiceLetterB = new JogoModel("b", R.drawable.letra_b_03, R.drawable.bt_b); 
		
		JogoModel firstChoiceLetterC = new JogoModel("c", R.drawable.letra_c_01, R.drawable.bt_c);
		JogoModel secondChoiceLetterC = new JogoModel("c", R.drawable.letra_c_02, R.drawable.bt_c);
		JogoModel thirdChoiceLetterC = new JogoModel("c", R.drawable.letra_c_03, R.drawable.bt_c);
		JogoModel fourthChoiceLetterC = new JogoModel("c", R.drawable.letra_c_04, R.drawable.bt_c);
		
		JogoModel firstChoiceLetterD = new JogoModel("d", R.drawable.letra_d_01, R.drawable.bt_d); 
		JogoModel secondChoiceLetterD = new JogoModel("d", R.drawable.letra_d_02, R.drawable.bt_d); 
		JogoModel thirdChoiceLetterD = new JogoModel("d", R.drawable.letra_d_03, R.drawable.bt_d); 
		
		JogoModel firstChoiceLetterE = new JogoModel("e", R.drawable.letra_e_01, R.drawable.bt_e); 
		JogoModel secondChoiceLetterE = new JogoModel("e", R.drawable.letra_e_02, R.drawable.bt_e);
		JogoModel thirdChoiceLetterE = new JogoModel("e", R.drawable.letra_e_03, R.drawable.bt_e);
		
		JogoModel firstChoiceLetterF = new JogoModel("f", R.drawable.letra_f_01, R.drawable.bt_f); 
		JogoModel secondChoiceLetterF = new JogoModel("f", R.drawable.letra_f_02, R.drawable.bt_f);
		JogoModel thirdChoiceLetterF = new JogoModel("f", R.drawable.letra_f_03, R.drawable.bt_f);
		
		JogoModel firstChoiceLetterG = new JogoModel("g", R.drawable.letra_g_01, R.drawable.bt_g); 
		JogoModel secondChoiceLetterG = new JogoModel("g", R.drawable.letra_g_02, R.drawable.bt_g);
		JogoModel thirdChoiceLetterG = new JogoModel("g", R.drawable.letra_g_03, R.drawable.bt_g);
		
		JogoModel firstChoiceLetterH = new JogoModel("h", R.drawable.letra_h_01, R.drawable.bt_h);
		JogoModel secondChoiceLetterH = new JogoModel("h", R.drawable.letra_h_02, R.drawable.bt_h);
		JogoModel thirdChoiceLetterH = new JogoModel("h", R.drawable.letra_h_03, R.drawable.bt_h);
		
		JogoModel firstChoiceLetterI = new JogoModel("i", R.drawable.letra_i_01, R.drawable.bt_i); 
		JogoModel secondChoiceLetterI = new JogoModel("i", R.drawable.letra_i_02, R.drawable.bt_i); 
		JogoModel thirdChoiceLetterI = new JogoModel("i", R.drawable.letra_i_03, R.drawable.bt_i); 
		
		JogoModel firstChoiceLetterJ = new JogoModel("j", R.drawable.letra_j_01, R.drawable.bt_j);
		JogoModel secondChoiceLetterJ = new JogoModel("j", R.drawable.letra_j_02, R.drawable.bt_j);
		JogoModel thirdChoiceLetterJ = new JogoModel("j", R.drawable.letra_j_03, R.drawable.bt_j);
		
		JogoModel firstChoiceLetterK = new JogoModel("k", R.drawable.letra_k_01, R.drawable.bt_k); 
		
		JogoModel firstChoiceLetterL = new JogoModel("l", R.drawable.letra_l_01, R.drawable.bt_l); 
		JogoModel secondChoiceLetterL = new JogoModel("l", R.drawable.letra_l_02, R.drawable.bt_l); 
		JogoModel thirdChoiceLetterL = new JogoModel("l", R.drawable.letra_l_03, R.drawable.bt_l); 
		
		JogoModel firstChoiceLetterM = new JogoModel("m", R.drawable.letra_m_01, R.drawable.bt_m);
		JogoModel secondChoiceLetterM = new JogoModel("m", R.drawable.letra_m_02, R.drawable.bt_m);
		JogoModel thirdChoiceLetterM = new JogoModel("m", R.drawable.letra_m_03, R.drawable.bt_m);
		
		JogoModel firstChoiceLetterN = new JogoModel("n", R.drawable.letra_n_01, R.drawable.bt_n); 
		JogoModel secondChoiceLetterN = new JogoModel("n", R.drawable.letra_n_02, R.drawable.bt_n); 
		JogoModel thirdChoiceLetterN = new JogoModel("n", R.drawable.letra_n_03, R.drawable.bt_n); 
		
		JogoModel firstChoiceLetterO = new JogoModel("o", R.drawable.letra_o_01, R.drawable.bt_o); 
		JogoModel secondChoiceLetterO = new JogoModel("o", R.drawable.letra_o_02, R.drawable.bt_o); 
		JogoModel thirdChoiceLetterO = new JogoModel("o", R.drawable.letra_o_03, R.drawable.bt_o); 
		
		JogoModel firstChoiceLetterP = new JogoModel("p", R.drawable.letra_p_01, R.drawable.bt_p); 
		JogoModel secondChoiceLetterP = new JogoModel("p", R.drawable.letra_p_02, R.drawable.bt_p); 
		JogoModel thirdChoiceLetterP = new JogoModel("p", R.drawable.letra_p_03, R.drawable.bt_p); 
		
		JogoModel firstChoiceLetterQ = new JogoModel("q", R.drawable.letra_q_01, R.drawable.bt_q); 
		JogoModel secondChoiceLetterQ = new JogoModel("q", R.drawable.letra_q_02, R.drawable.bt_q); 
		JogoModel thirdChoiceLetterQ = new JogoModel("q", R.drawable.letra_q_03, R.drawable.bt_q); 
		
		JogoModel firstChoiceLetterR = new JogoModel("r", R.drawable.letra_r_01, R.drawable.bt_r);
		JogoModel secondChoiceLetterR = new JogoModel("r", R.drawable.letra_r_02, R.drawable.bt_r);
		JogoModel thirdChoiceLetterR = new JogoModel("r", R.drawable.letra_r_03, R.drawable.bt_r);
		
		JogoModel firstChoiceLetterS = new JogoModel("s", R.drawable.letra_s_01, R.drawable.bt_s);
		JogoModel secondChoiceLetterS = new JogoModel("s", R.drawable.letra_s_02, R.drawable.bt_s);
		JogoModel thirdChoiceLetterS = new JogoModel("s", R.drawable.letra_s_03, R.drawable.bt_s);
		
		JogoModel firstChoiceLetterT = new JogoModel("t", R.drawable.letra_t_01, R.drawable.bt_t); 
		JogoModel secondChoiceLetterT = new JogoModel("t", R.drawable.letra_t_02, R.drawable.bt_t); 
		JogoModel ThirdChoiceLetterT = new JogoModel("t", R.drawable.letra_t_03, R.drawable.bt_t); 
		
		JogoModel firstChoiceLetterU = new JogoModel("u", R.drawable.letra_u_01, R.drawable.bt_u);
		JogoModel secondChoiceLetterU = new JogoModel("u", R.drawable.letra_u_02, R.drawable.bt_u);
		JogoModel thirdChoiceLetterU = new JogoModel("u", R.drawable.letra_u_03, R.drawable.bt_u);
		
		JogoModel firstChoiceLetterV = new JogoModel("v", R.drawable.letra_v_01, R.drawable.bt_v);
		JogoModel secondChoiceLetterV = new JogoModel("v", R.drawable.letra_v_02, R.drawable.bt_v);
		JogoModel thirdChoiceLetterV = new JogoModel("v", R.drawable.letra_v_03, R.drawable.bt_v);
		
		JogoModel firstChoiceLetterW = new JogoModel("w", R.drawable.letra_w_01, R.drawable.bt_w); 
		JogoModel secondChoiceLetterW = new JogoModel("w", R.drawable.letra_w_02, R.drawable.bt_w); 
		
		JogoModel firstChoiceLetterX = new JogoModel("x", R.drawable.letra_x_01, R.drawable.bt_x);
		JogoModel secondChoiceLetterX = new JogoModel("x", R.drawable.letra_x_02, R.drawable.bt_x);
		
		JogoModel firstChoiceLetterY = new JogoModel("y", R.drawable.letra_y_01, R.drawable.bt_y);
		
		JogoModel firstChoiceLetterZ = new JogoModel("z", R.drawable.letra_z_01, R.drawable.bt_z);
		JogoModel secondChoiceLetterZ = new JogoModel("z", R.drawable.letra_z_02, R.drawable.bt_z);
		
	
		//Declaring and instantiating objects of type GameModel related to numbers
		JogoModel firstChoiceNumber1 = new JogoModel("1",R.drawable.num_1_01, R.drawable.bt_1 );
		JogoModel secondChoiceNumber1 = new JogoModel("1",R.drawable.num_1_02, R.drawable.bt_1 );
		JogoModel thirdChoiceNumber1 = new JogoModel("1",R.drawable.num_1_03, R.drawable.bt_1 );
		JogoModel fourthChoiceNumber1 = new JogoModel("1",R.drawable.num_1_04, R.drawable.bt_1 );
		JogoModel fifthChoiceNumber1 = new JogoModel("1",R.drawable.num_1_05, R.drawable.bt_1 );
		JogoModel sixthChoiceNumber1 = new JogoModel("1",R.drawable.num_1_06, R.drawable.bt_1 );
	
		JogoModel firstChoiceNumber2 = new JogoModel("2",R.drawable.num_2_01, R.drawable.bt_2 );
		JogoModel secondChoiceNumber2 = new JogoModel("2",R.drawable.num_2_02, R.drawable.bt_2 );
		JogoModel thirdChoiceNumber2 = new JogoModel("2",R.drawable.num_2_03, R.drawable.bt_2 );
		JogoModel fourthChoiceNumber2 = new JogoModel("2",R.drawable.num_2_04, R.drawable.bt_2 );
		JogoModel fifthChoiceNumber2 = new JogoModel("2",R.drawable.num_2_05, R.drawable.bt_2 );
		JogoModel sixthChoiceNumber2 = new JogoModel("2",R.drawable.num_2_06, R.drawable.bt_2 );
	
		JogoModel firstChoiceNumber3 = new JogoModel("3",R.drawable.num_3_01, R.drawable.bt_3 );	
		JogoModel secondChoiceNumber3 = new JogoModel("3",R.drawable.num_3_02, R.drawable.bt_3 );
		JogoModel thirdChoiceNumber3 = new JogoModel("3",R.drawable.num_3_03, R.drawable.bt_3 );
		JogoModel fourthChoiceNumber3 = new JogoModel("3",R.drawable.num_3_04, R.drawable.bt_3 );
		JogoModel fifthChoiceNumber3 = new JogoModel("3",R.drawable.num_3_05, R.drawable.bt_3 );
		JogoModel sixthChoiceNumber3 = new JogoModel("3",R.drawable.num_3_06, R.drawable.bt_3 );
	
		JogoModel firstChoiceNumber4 = new JogoModel("4",R.drawable.num_4_01, R.drawable.bt_4 );
		JogoModel thirdChoiceNumber4 = new JogoModel("4",R.drawable.num_4_03, R.drawable.bt_4 );
		JogoModel fourthChoiceNumber4 = new JogoModel("4",R.drawable.num_4_04, R.drawable.bt_4 );
		JogoModel fifthChoiceNumber4 = new JogoModel("4",R.drawable.num_4_05, R.drawable.bt_4 );
		JogoModel sixthChoiceNumber4 = new JogoModel("4",R.drawable.num_4_06, R.drawable.bt_4 );
	
		JogoModel firstChoiceNumber5 = new JogoModel("5",R.drawable.num_5_01, R.drawable.bt_5 );
		JogoModel secondChoiceNumber5 = new JogoModel("5",R.drawable.num_5_02, R.drawable.bt_5 );
		JogoModel thirdChoiceNumber5 = new JogoModel("5",R.drawable.num_5_03, R.drawable.bt_5 );
		JogoModel fourthChoiceNumber5 = new JogoModel("5",R.drawable.num_5_04, R.drawable.bt_5 );
		JogoModel fifthChoiceNumber5 = new JogoModel("5",R.drawable.num_5_05, R.drawable.bt_5 );
		JogoModel sixthChoiceNumber5 = new JogoModel("5",R.drawable.num_5_06, R.drawable.bt_5 );
	
		JogoModel firstChoiceNumber6 = new JogoModel("6",R.drawable.num_6_01, R.drawable.bt_6 );
		JogoModel secondChoiceNumber6 = new JogoModel("6",R.drawable.num_6_02, R.drawable.bt_6 );
		JogoModel thirdChoiceNumber6 = new JogoModel("6",R.drawable.num_6_03, R.drawable.bt_6 );
		JogoModel fourthChoiceNumber6 = new JogoModel("6",R.drawable.num_6_04, R.drawable.bt_6 );
		JogoModel fifthChoiceNumber6 = new JogoModel("6",R.drawable.num_6_05, R.drawable.bt_6 );
		JogoModel sixthChoiceNumber6 = new JogoModel("6",R.drawable.num_6_06, R.drawable.bt_6 );
	
		JogoModel firstChoiceNumber7 = new JogoModel("7",R.drawable.num_7_01, R.drawable.bt_7 );
		JogoModel secondChoiceNumber7 = new JogoModel("7",R.drawable.num_7_02, R.drawable.bt_7 );
		JogoModel thirdChoiceNumber7 = new JogoModel("7",R.drawable.num_7_03, R.drawable.bt_7 );
		JogoModel fourthChoiceNumber7 = new JogoModel("7",R.drawable.num_7_04, R.drawable.bt_7 );
		JogoModel fifthChoiceNumber7 = new JogoModel("7",R.drawable.num_7_05, R.drawable.bt_7 );
		JogoModel sixthChoiceNumber7 = new JogoModel("7",R.drawable.num_7_06, R.drawable.bt_7 );
	
		JogoModel FirstChoiceNumber8 = new JogoModel("8",R.drawable.num_8_01, R.drawable.bt_8 );
		JogoModel secondChoiceNumber8 = new JogoModel("8",R.drawable.num_8_02, R.drawable.bt_8 );
		JogoModel thirdChoiceNumber8JogoModel("8",R.drawable.num_8_03, R.drawable.bt_8 );
		JogoModel fourthChoiceNumber8 = new JogoModel("8",R.drawable.num_8_04, R.drawable.bt_8 );
		JogoModel fifthChoiceNumber8 = new JogoModel("8",R.drawable.num_8_05, R.drawable.bt_8 );
		JogoModel sixthChoiceNumber8 = new JogoModel("8",R.drawable.num_8_06, R.drawable.bt_8 );
	
		JogoModel firstChoiceNumber9 = new JogoModel("9",R.drawable.num_9_01, R.drawable.bt_9 );
		JogoModel secondChoiceNumber9 = new JogoModel("9",R.drawable.num_9_02, R.drawable.bt_9 );
		JogoModel thirdChoiceNumber9 = new JogoModel("9",R.drawable.num_9_03, R.drawable.bt_9 );
		JogoModel fourthChoiceNumber9 = new JogoModel("9",R.drawable.num_9_04, R.drawable.bt_9 );
		JogoModel fifthChoiceNumber9 = new JogoModel("9",R.drawable.num_9_05, R.drawable.bt_9 );
		JogoModel sixthChoiceNumber9 = new JogoModel("9",R.drawable.num_9_06, R.drawable.bt_9 );
	
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

	// Function to return object of type JogoModel from sending a desired number
	public JogoModel getModelNumero(String numero) {

		Iterator<JogoModel> i = cadastroNumero.iterator();

		Collections.shuffle(cadastroNumero);

		while (i.hasNext()) {

			JogoModel jm = (JogoModel) i.next();

			String nome = jm.getNome();

			if (nome.equalsIgnoreCase(numero))
				return jm;
		}

		return null;
	}

	// Function to return object of type JogoModel from sending a letter desired
	public JogoModel getModelLetra(String letra) {

		Iterator<JogoModel> i = cadastroLetra.iterator();

		Collections.shuffle(cadastroLetra);

		while (i.hasNext()) {

			JogoModel jm = (JogoModel) i.next();

			String nome = jm.getNome();

			if (nome.equalsIgnoreCase(letra)) {

				return jm;
			}
		}

		return null;
	}
}
