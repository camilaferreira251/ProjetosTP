/*Class LearnPersistence
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
/*
 * This class have the options for numbers and letters 
 */
import java.util.ArrayList;
import java.util.Iterator;

import fga.mds.abcdario.R;

public class LearnPersistence {

	private ArrayList<LearnModel> registrationNumber= new ArrayList<LearnModel>();
	private ArrayList<LearnModel> registrationLetter= new ArrayList<LearnModel>();
	
	private static LearnPersistence instance;
	
	private LearnPersistence(){}
	
	public static LearnPersistence getInstance(){
		if(instance == null){
			instance = new LearnPersistence();
			instance.atualizaCadastro();
		}
		
		else{
			//nothing to do here
		}
		
		return instance;
	}
// Opcions for letters and numbers
	public int atualizaCadastro() {
		
		LearnModel letra_a = new LearnModel("a",R.drawable.a_abelha, R.raw.a_aviao);		
		LearnModel letra_b = new LearnModel("b", R.drawable.b_de_borboleta, R.raw.b_borboleta); 		
		LearnModel letra_c = new LearnModel("c", R.drawable.c_casa, R.raw.c_casa);
		LearnModel letra_d = new LearnModel("d", R.drawable.d_de_dinossauro, R.raw.d_dinossauro);
		LearnModel letra_e = new LearnModel("e", R.drawable.e_de_esquilo, R.raw.e_esquilo);
		LearnModel letra_f = new LearnModel("f", R.drawable.f_de_foca, R.raw.f_foca);
		LearnModel letra_g = new LearnModel("g", R.drawable.g_de_goiaba, R.raw.g_goiaba);
		LearnModel letra_h = new LearnModel("h", R.drawable.h_de_hipopotamo, R.raw.h_hipopotamo);
		LearnModel letra_i = new LearnModel("i", R.drawable.i_indio, R.raw.i_indio);
		LearnModel letra_j = new LearnModel("j", R.drawable.j_jacare, R.raw.j_jacare);
		LearnModel letra_k = new LearnModel("k", R.drawable.k_de_ketchup, R.raw.k_ketchup);
		LearnModel letra_l = new LearnModel("l", R.drawable.l_leao, R.raw.l_leao);
		LearnModel letra_m = new LearnModel("m", R.drawable.m_de_maca, R.raw.m_maca);
		LearnModel letra_n = new LearnModel("n", R.drawable.n_navio, R.raw.n_navio);
		LearnModel letra_o = new LearnModel("o", R.drawable.o_de_onibus, R.raw.o_onibus);
		LearnModel letra_p = new LearnModel("p", R.drawable.p_de_patins, R.raw.p_patins);
		LearnModel letra_q = new LearnModel("q", R.drawable.q_queijo, R.raw.q_queijo);
		LearnModel letra_r = new LearnModel("r", R.drawable.r_rato, R.raw.r_rato);
		LearnModel letra_s = new LearnModel("s", R.drawable.s_sapo, R.raw.s_sapo);
		LearnModel letra_t = new LearnModel("t", R.drawable.t_tatu, R.raw.t_tatu);
		LearnModel letra_u = new LearnModel("u", R.drawable.u_de_urso, R.raw.u_urso);
		LearnModel letra_v = new LearnModel("v", R.drawable.v_vaca, R.raw.v_vaca);
		LearnModel letra_w = new LearnModel("w", R.drawable.w_de_wafer, R.raw.w_wafer);
		LearnModel letra_x = new LearnModel("x", R.drawable.x_xicara, R.raw.x_xicara);
		LearnModel letra_y = new LearnModel("y", R.drawable.y_yakult, R.raw.y_yakult);
		LearnModel letra_z = new LearnModel("z", R.drawable.z_zebra, R.raw.z_zebra);
		
		LearnModel numero_1 = new LearnModel("1", R.drawable.num_1_um, R.raw.um);
		LearnModel numero_2 = new LearnModel("2", R.drawable.num_2_dois, R.raw.dois);
		LearnModel numero_3 = new LearnModel("3", R.drawable.num_3_tres, R.raw.tres);
		LearnModel numero_4 = new LearnModel("4", R.drawable.num_4_quatro, R.raw.quatro);
		LearnModel numero_5 = new LearnModel("5", R.drawable.num_5_cinco, R.raw.cinco);
		LearnModel numero_6 = new LearnModel("6", R.drawable.num_6_seis, R.raw.seis);
		LearnModel numero_7 = new LearnModel("7", R.drawable.num_7_sete, R.raw.sete);
		LearnModel numero_8 = new LearnModel("8", R.drawable.num_8_oito, R.raw.oito);
		LearnModel numero_9 = new LearnModel("9", R.drawable.num_9_nove, R.raw.nove);
		
		registrationLetter.add(letra_a);		
		registrationLetter.add(letra_b);		
		registrationLetter.add(letra_c);
		registrationLetter.add(letra_d);
		registrationLetter.add(letra_e);
		registrationLetter.add(letra_f);
		registrationLetter.add(letra_g);
		registrationLetter.add(letra_h);
		registrationLetter.add(letra_i);
		registrationLetter.add(letra_j);
		registrationLetter.add(letra_k);
		registrationLetter.add(letra_l);
		registrationLetter.add(letra_m);
		registrationLetter.add(letra_n);
		registrationLetter.add(letra_o);
		registrationLetter.add(letra_p);
		registrationLetter.add(letra_q);
		registrationLetter.add(letra_r);
		registrationLetter.add(letra_s);
		registrationLetter.add(letra_t);
		registrationLetter.add(letra_u);
		registrationLetter.add(letra_v);
		registrationLetter.add(letra_w);
		registrationLetter.add(letra_x);
		registrationLetter.add(letra_y);
		registrationLetter.add(letra_z);
		
		registrationNumber.add(numero_1);
		registrationNumber.add(numero_2);
		registrationNumber.add(numero_3);
		registrationNumber.add(numero_4);
		registrationNumber.add(numero_5);
		registrationNumber.add(numero_6);
		registrationNumber.add(numero_7);
		registrationNumber.add(numero_8);
		registrationNumber.add(numero_9);
		
		if(registrationLetter.isEmpty())
			return -1;
		
		else {
			// nothing to do here
		}
				
		return 0;
	}
	
	public LearnModel getModelLetter(String letra){
			
		Iterator<LearnModel> i = registrationLetter.iterator();
		
		while(i.hasNext()){
			
			LearnModel am = (LearnModel) i.next();
			
			String nome = am.getName();
			
			if(nome.equalsIgnoreCase(letra)){
				return am;
				}
			
			else{
				//nothing to do here
			}
		}
			
		
		return null;
	}

	public LearnModel getModelNumber(String j) {
		
		Iterator<LearnModel> i = registrationNumber.iterator();
		
		while(i.hasNext()){
			
			LearnModel am = (LearnModel) i.next();
			
			String nome = am.getName();
			
			if(nome.equalsIgnoreCase(j)){
				return am;
				}
			else{
				// nothing to do here
			}
		}
		
		return null;
	}
}
