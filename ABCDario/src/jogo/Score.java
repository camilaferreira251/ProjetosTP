/*Classe Score
 * Abcd�rio is free software: you can redistribute it and / or

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

import fga.mds.abcdario.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Score extends Activity {

	// Declaração das variáveis, textView e Bundle.

	private TextView sucesses_field; // Campo que informa quantidade de acertos
									// realizados no jogo.
	private TextView mistakes_field; // Campo que informa quantidade de erros
									// realizados no jogo.
	private ImageView stars; // Imagem de estrela que varia de acordo com a
								// porcentagem de acertos realizados no jogo.
	private ImageView bt_back; // Imagem utilizada como botão para retornar
									// para tela anterior.
	private Bundle params; // Declaração de variável do tipo Bundle para
							// manipulação de parâmetros.
	private int qtd_sucesses; // Declaração de variável int para armazenar a
								// quantidade de acertos realizados no jogo.
	private int qtd_mistakes; // Declaração de variável int para armazenar a
							// quantidade de erros realizados no jogo.
	private float porcentageSucesses; // Declaração de variável float para
										// armazenar a procentagem de acertos.
	private ScoreController controller;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.score_activity); // Setando XML score_activity
													// na Tela.

		controller = new ScoreController();
		inicializarComponentes(); // Chamando função para iniciar os
									// componentes de tela utilizando ID.
		params = obterParametros(); // Obtendo os parametros que a activity de
									// jogo passou para o Bundle.
		qtd_sucesses = setandoNumerosAcertosTela(params);// Setando na tela, no
														// campo de acertos a
														// quantidade obtida.
		qtd_mistakes = setandoNumerosErrosTela(params); // Setando na tela, no
														// campo de erros a
														// quantidade obtida.
		porcentageSucesses = calculaPorcentagemAcertos(qtd_sucesses, qtd_mistakes); // Calculando
																				// porcentagem
																				// de
																				// acertos.
		definirImgEstrelas(porcentageSucesses);
		definirEventos(); // Definindo evento do botão voltar.
	}

	private void inicializarComponentes() {
		stars = (ImageView) findViewById(R.id.estrelas);
		bt_back = (ImageView) findViewById(R.id.bt_voltar);
		sucesses_field = (TextView) findViewById(R.id.campo_acertos);
		mistakes_field = (TextView) findViewById(R.id.campo_erros);
	}

	private Bundle obterParametros() {
		Intent intent = getIntent();
		Bundle params = intent.getExtras();
		return params;
	}

	private int setandoNumerosAcertosTela(Bundle params) {
		if (params != null)
			;
		{
			int mostraacertos = params.getInt("acertos");
			String acertos = Integer.toString(mostraacertos);
			sucesses_field.setText(acertos);
			return mostraacertos;
		}
	}

	private int setandoNumerosErrosTela(Bundle params) {
		if (params != null)
			;
		{
			int mostraerros = params.getInt("erros");
			String erros = Integer.toString(mostraerros);
			mistakes_field.setText(erros);
			return mostraerros;
		}
	}

	private float calculaPorcentagemAcertos(int qtd_acertos, int qtd_erros) {
		float porcentagem = controller.calculaPorcentagemAcertos(qtd_acertos,
				qtd_erros);
		return porcentagem;
	}

	private void definirEventos() {
		bt_back.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				finish();
			}
		});
	}

	private void definirImgEstrelas(float porcentagemAcertos) {
		stars.setImageDrawable(getResources().getDrawable(
				controller.definirImgEstrelas(porcentagemAcertos)));
	}

}
