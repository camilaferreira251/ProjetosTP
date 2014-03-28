package jogo;

import java.util.ArrayList;
import java.util.Iterator;

import fga.mds.abcdario.R;

public class AprenderPersistencia {

	private ArrayList<LearnModel> cadastroNumero= new ArrayList<LearnModel>();
	private ArrayList<LearnModel> cadastroLetra= new ArrayList<LearnModel>();
	
	private static AprenderPersistencia instance;
	
	private AprenderPersistencia(){}
	
	public static AprenderPersistencia getInstance(){
		if(instance == null){
			instance = new AprenderPersistencia();
			instance.atualizaCadastro();
		}
		return instance;
	}

	private int atualizaCadastro() {
		
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
		
		cadastroLetra.add(letra_a);		
		cadastroLetra.add(letra_b);		
		cadastroLetra.add(letra_c);
		cadastroLetra.add(letra_d);
		cadastroLetra.add(letra_e);
		cadastroLetra.add(letra_f);
		cadastroLetra.add(letra_g);
		cadastroLetra.add(letra_h);
		cadastroLetra.add(letra_i);
		cadastroLetra.add(letra_j);
		cadastroLetra.add(letra_k);
		cadastroLetra.add(letra_l);
		cadastroLetra.add(letra_m);
		cadastroLetra.add(letra_n);
		cadastroLetra.add(letra_o);
		cadastroLetra.add(letra_p);
		cadastroLetra.add(letra_q);
		cadastroLetra.add(letra_r);
		cadastroLetra.add(letra_s);
		cadastroLetra.add(letra_t);
		cadastroLetra.add(letra_u);
		cadastroLetra.add(letra_v);
		cadastroLetra.add(letra_w);
		cadastroLetra.add(letra_x);
		cadastroLetra.add(letra_y);
		cadastroLetra.add(letra_z);
		
		cadastroNumero.add(numero_1);
		cadastroNumero.add(numero_2);
		cadastroNumero.add(numero_3);
		cadastroNumero.add(numero_4);
		cadastroNumero.add(numero_5);
		cadastroNumero.add(numero_6);
		cadastroNumero.add(numero_7);
		cadastroNumero.add(numero_8);
		cadastroNumero.add(numero_9);
		
		if(cadastroLetra.isEmpty())
			return -1;
				
		return 0;
	}
	
	public LearnModel getModelLetra(String letra){
			
		Iterator<LearnModel> i = cadastroLetra.iterator();
		
		while(i.hasNext()){
			
			LearnModel am = (LearnModel) i.next();
			
			String nome = am.getNome();
			
			if(nome.equalsIgnoreCase(letra))
				return am;
		}
		
		return null;
	}

	public LearnModel getModelNumero(String numero) {
		
		Iterator<LearnModel> i = cadastroNumero.iterator();
		
		while(i.hasNext()){
			
			LearnModel am = (LearnModel) i.next();
			
			String nome = am.getNome();
			
			if(nome.equalsIgnoreCase(numero))
				return am;
		}
		
		return null;
	}
}
