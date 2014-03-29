/*Class GameLetter
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

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import fga.mds.abcdario.R;

public class GameLetter extends AbstractActivity {

	private ImageView centralImage, browseButton1, browseButton2, backButton,
			rightButton;
	private int hitsCount = 0, errorCount = 0;

	private JogoController controller;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jogo_letra);

		initializeComponents();
		defineEvents();
	}

	@Override
	public void initializeComponents() {

		controller = new JogoController();
		int[] id = new int[2];
		int idBotao;

		centralImage = (ImageView) findViewById(R.id.imagem_central);
		browseButton1 = (ImageView) findViewById(R.id.bt_1);
		browseButton2 = (ImageView) findViewById(R.id.bt_2);
		backButton = (ImageView) findViewById(R.id.bt_voltar);

		id = controller.getModelLetra();
		idBotao = controller.getIdBotaoLetra();

		refreshImage(id[0]);
		refreshButton(id[1], idBotao);
	}

	private void refreshButton(int btModel, int bt) {

		while (btModel == bt)
			bt = controller.getIdBotaoLetra();

		if (controller.getIdBotaoLetra() % 2 == 0) {
			browseButton1.setImageResource(btModel);
			browseButton2.setImageResource(bt);

			rightButton = browseButton1;
		} else {
			browseButton2.setImageResource(btModel);
			browseButton1.setImageResource(bt);

			rightButton = browseButton2;
		}
	}

	private void refreshImage(int id) {
		centralImage.setImageResource(id);
	}

	@Override
	public void defineEvents() {

		backButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Bundle params = new Bundle();
				Intent intent = new Intent(GameLetter.this, Score.class);
				params.putInt("acertos", hitsCount);
				params.putInt("erros", errorCount);
				intent.putExtras(params);
				startActivity(intent);
				finish();

			}
		});

		browseButton1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						GameLetter.this);

				if (browseButton1 == rightButton) {
					hitsCount++;

					alertDialogBuilder.setTitle(" ");

					alertDialogBuilder

							.setIcon(R.drawable.img_resposta_certa)
							.setCancelable(false)
							.setNegativeButton("Voltar",
									new DialogInterface.OnClickListener() {
										public void onClick(
												DialogInterface dialog, int id) {
											initializeComponents();
											dialog.cancel();
										}
									});

					AlertDialog popUpImagem = alertDialogBuilder.create();

					popUpImagem.show();

				} else {
					errorCount++;

					alertDialogBuilder.setTitle(" ");

					alertDialogBuilder

							.setIcon(R.drawable.img_resposta_errada)
							.setCancelable(false)
							.setNegativeButton("Voltar",
									new DialogInterface.OnClickListener() {
										public void onClick(
												DialogInterface dialog, int id) {
											initializeComponents();
											dialog.cancel();
										}
									});

					AlertDialog popUpImagem = alertDialogBuilder.create();

					popUpImagem.show();
				}
			}

		});

		browseButton2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						GameLetter.this);

				if (browseButton2 == rightButton) {
					hitsCount++;

					alertDialogBuilder.setTitle(" ");

					alertDialogBuilder

							.setIcon(R.drawable.img_resposta_certa)
							.setCancelable(false)
							.setNegativeButton("Voltar",
									new DialogInterface.OnClickListener() {
										public void onClick(
												DialogInterface dialog, int id) {
											initializeComponents();
											dialog.cancel();
										}
									});

					AlertDialog popUpImagem = alertDialogBuilder.create();

					popUpImagem.show();

				} else {
					errorCount++;

					alertDialogBuilder.setTitle(" ");

					alertDialogBuilder

							.setIcon(R.drawable.img_resposta_errada)
							.setCancelable(false)
							.setNegativeButton("Voltar",
									new DialogInterface.OnClickListener() {
										public void onClick(
												DialogInterface dialog, int id) {
											initializeComponents();
											dialog.cancel();
										}
									});

					AlertDialog popUpImagem = alertDialogBuilder.create();

					popUpImagem.show();

				}
			}
		});
	}

}