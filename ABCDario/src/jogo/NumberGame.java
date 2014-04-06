/*Classe NumberGame
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

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import fga.mds.abcdario.R;

public class NumberGame extends AbstractActivity {

	private ImageView central_image, bt_1, bt_2, bt_back, bt_right;
	private int cont_hit = 0, cont_error = 0;
	
	private GameController controller;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jogo_numero);
		
		initializeComponents();
		defineEvents();
	}
	
	@Override
	public void initializeComponents() {	
		
		controller = new GameController();
		int[] id = new int[2];
		int idButon;
		
		central_image = (ImageView) findViewById(R.id.imagem_central);
		bt_1 = (ImageView) findViewById(R.id.bt_1);
		bt_2 = (ImageView) findViewById(R.id.bt_2);
		bt_back = (ImageView) findViewById(R.id.bt_voltar);
		
		id = controller.getModelNumero();
		idButon = controller.getIdBotaoNumero();
		
		atualizarImagem(id[0]);
		atualizarBotao(id[1], idButon);
	}

	private void atualizarBotao(int btModel, int bt) {
		
		while(btModel == bt)
			bt = controller.getIdBotaoNumero();
		
		if(controller.getIdBotaoNumero() % 2 == 0){
			bt_1.setImageResource(btModel);
			bt_2.setImageResource(bt);
			
			bt_right = bt_1;
		} else{
			bt_2.setImageResource(btModel);
			bt_1.setImageResource(bt);
			
			bt_right = bt_2;
		}
	}

	private void atualizarImagem(int id) {
		central_image.setImageResource(id);
	}

	@Override
	public void defineEvents() {
		
		
		bt_back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				Bundle params = new Bundle();
				Intent intent = new Intent(NumberGame.this, Score.class);
				params.putInt("acertos" , cont_hit);
                params.putInt("erros" , cont_error);
                intent.putExtras(params);
                startActivity(intent);
                finish();
			}
		});
		
		bt_1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						NumberGame.this);
				
				if(bt_1 == bt_right){
					cont_hit++;
  	
					alertDialogBuilder.setTitle(" ");

					alertDialogBuilder
				
						.setIcon(R.drawable.img_resposta_certa)    
						.setCancelable(false)
						.setNegativeButton("Voltar",new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,int id) {
								initializeComponents();
								dialog.cancel();
							}
							});

						AlertDialog popUpImagem = alertDialogBuilder.create();

						popUpImagem.show();
					  

				} else{
					cont_error++;
					
						alertDialogBuilder.setTitle(" ");

						alertDialogBuilder
					
							.setIcon(R.drawable.img_resposta_errada)    
							.setCancelable(false)
							.setNegativeButton("Voltar",new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,int id) {
									initializeComponents();
									dialog.cancel();
								}
								});

							AlertDialog popUpImagem = alertDialogBuilder.create();

							popUpImagem.show();
				}
			}
			
		});
		
		bt_2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						NumberGame.this);
				
				if(bt_2 == bt_right){
					cont_hit++;
	  	
						alertDialogBuilder.setTitle(" ");

						alertDialogBuilder
					
							.setIcon(R.drawable.img_resposta_certa)    
							.setCancelable(false)
							.setNegativeButton("Voltar",new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,int id) {
									initializeComponents();
									dialog.cancel();
								}
								});

							AlertDialog popUpImagem = alertDialogBuilder.create();

							popUpImagem.show();

				} else{
					cont_error++;
			
					alertDialogBuilder.setTitle(" ");

					alertDialogBuilder
				
						.setIcon(R.drawable.img_resposta_errada)    
						.setCancelable(false)
						.setNegativeButton("Voltar",new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,int id) {
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