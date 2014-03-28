package jogo;

public class LearnModel {

	private String name;
	private int image;
	private int audio;

	public LearnModel(String name, int image, int audio) {
		this.name = name;
		this.image = image;
		this.audio = audio;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public int getImagem() {
		return image;
	}

	public void setImagem(int imagem) {
		this.image = imagem;
	}

	public int getAudio() {
		return audio;
	}

	public void setAudio(int audio) {
		this.audio = audio;
	}
}
