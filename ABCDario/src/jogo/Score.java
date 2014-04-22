/*Classe Score
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

import fga.mds.abcdario.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Score extends Activity {

	private TextView sucessesField; 
	private TextView mistakesField; 
	private ImageView starsImage; 
	private ImageView buttonBack; 
	private Bundle params; 
	private int quantitySucesses; 
	private int quantityMistakes;
	private float porcentageSucesses; 
	private ScoreController controller;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.score_activity); // Setting XML score_activity on screen.

		controller = new ScoreController();
		initializeComponents(); 
		params = obtainParameters();
		quantitySucesses = settingSucessesNumberScreen(params);
		quantityMistakes = settingMistakesNumberScreen(params);
		porcentageSucesses = calculateSucessesPorcentage(quantitySucesses, quantityMistakes);
		definirImgEstrelas(porcentageSucesses);
		defineEvents();
	}

	private void initializeComponents() {
		starsImage = (ImageView) findViewById(R.id.estrelas);
		buttonBack = (ImageView) findViewById(R.id.bt_voltar);
		sucessesField = (TextView) findViewById(R.id.campo_acertos);
		mistakesField = (TextView) findViewById(R.id.campo_erros);
	}

	private Bundle obtainParameters() {
		Intent intent = getIntent();
		Bundle params = intent.getExtras();
		return params;
	}

	private int settingSucessesNumberScreen(Bundle params) {
		if (params != null)
			;
		{
			int showsucesses = params.getInt("acertos");
			String sucesses = Integer.toString(showsucesses);
			sucessesField.setText(sucesses);
			return showsucesses;
		}
	}

	private int settingMistakesNumberScreen(Bundle params) {
		if (params != null)
			;
		{
			int showMistakes = params.getInt("erros");
			String mistakes = Integer.toString(showMistakes);
			mistakesField.setText(mistakes);
			return showMistakes;
		}
	}

	private float calculateSucessesPorcentage(int quantitySucesses, int quantityMistakes) {
		float porcentage = controller.calculaPorcentagemAcertos(quantitySucesses,
				quantityMistakes);
		return porcentage;
	}

	private void defineEvents() {
		buttonBack.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				finish();
			}
		});
	}

	private void definirImgEstrelas(float porcentagemAcertos) {
		starsImage.setImageDrawable(getResources().getDrawable(
				controller.definirImgEstrelas(porcentagemAcertos)));
	}

}
