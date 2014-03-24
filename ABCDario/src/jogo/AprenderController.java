package jogo;


public class AprenderController {

	public AprenderController(){}
	
	private AprenderPersistencia acessar = AprenderPersistencia.getInstance();
	private AprenderModel tela;

	public int[] definirLetra(String letra){
		
		int id[] = new int[2];
		
		tela = acessar.getModelLetra(letra);
		
		id[0] = tela.getImagem();
		id[1] = tela.getAudio();
		
		return id;
	}

	public int[] definirNumero(String numero){

		int id[] = new int[2];
		
		tela = acessar.getModelNumero(numero);
		
		id[0] = tela.getImagem();
		id[1] = tela.getAudio();
		
		return id;
	}
	
	public char proximaLetra(char letra){
		
		return 'a';
	}
	
	public char anteriorLetra(char letra){
		
		return 'a';
	}
}
