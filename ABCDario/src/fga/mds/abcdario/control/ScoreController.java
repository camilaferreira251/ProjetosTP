package fga.mds.abcdario.control;

import jogo.ScorePersistence;
import fga.mds.abcdario.R;

public class ScoreController {

	private ScorePersistence acessarScore = ScorePersistence.getInstance();
	
	public float calculaPorcentagemAcertos(int qtd_acertos, int qtd_erros) {
		
		float qtd_total = qtd_acertos + qtd_erros;
		float porcentagem;		
		porcentagem = 100*qtd_acertos/qtd_total;		
		return porcentagem;				
	}
	
	
	public int definirImgEstrelas(float porcentagemAcertos) {
		
		acessarScore.criaEarmazenaArrayListDeImagens();
		
		if (porcentagemAcertos < 20 && porcentagemAcertos > 0 ){
			int id_img_estrela = acessarScore.getModelImagemEstrela(1);						
			return id_img_estrela;
		}
		if (porcentagemAcertos < 40 && porcentagemAcertos >= 20){
			int id_img_estrela = acessarScore.getModelImagemEstrela(2);						
			return id_img_estrela;
		}
		if (porcentagemAcertos < 60 && porcentagemAcertos >= 40){
			int id_img_estrela = acessarScore.getModelImagemEstrela(3);						
			return id_img_estrela;
		}
		if (porcentagemAcertos < 80 && porcentagemAcertos >= 60){
			int id_img_estrela = acessarScore.getModelImagemEstrela(4);						
			return id_img_estrela;
		}
		if (porcentagemAcertos <= 100 && porcentagemAcertos >= 80){
			int id_img_estrela = acessarScore.getModelImagemEstrela(5);						
			return id_img_estrela;
		}
		if (porcentagemAcertos == 0){
				int id_img_estrela = acessarScore.getModelImagemEstrela(0);						
				return id_img_estrela;
				
		}else
			return R.drawable.img_0_estrelas;
		
	}

}