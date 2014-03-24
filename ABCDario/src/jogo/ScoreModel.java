package jogo;

public class ScoreModel{
	
	private int quantidade; 
	private int img_estrela;
	
	public ScoreModel(int quantidade, int imgEstrela) {
		setImg_estrela(imgEstrela);
		setQuantidade(quantidade);
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getImg_estrela() {
		return img_estrela;
	}

	public void setImg_estrela(int img_estrela) {
		this.img_estrela = img_estrela;
	}

}
