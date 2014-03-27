/*Classe JogoModel
	 * Abcdário is free software: you can redistribute it and / or

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

import java.io.Serializable;

@SuppressWarnings("serial")
public class JogoModel implements Serializable{

	private String nome;
	private int imagem;
	private int botao;
	
	public JogoModel(String nome, int imagem, int botao){
		setNome(nome);
		setImagem(imagem);
		setBotao(botao);
	}

	public int getImagem() {
		return imagem;
	}

	public void setImagem(int imagem) {
		this.imagem = imagem;
	}

	public int getBotao() {
		return botao;
	}

	public void setBotao(int botao) {
		this.botao = botao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
