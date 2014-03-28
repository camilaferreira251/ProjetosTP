	/*Classe InicioActivity
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
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class InicioActivity extends Activity {

	private ImageView bt_iniciar, bt_sair, bt_sobre;
	final Context context = this;
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inicio);
		
		inicializarComponentes();
		definirEventos();
	}
		public void initializeComponents(){
			bt_iniciar = (ImageView) findViewById(R.imgV.bt_iniciar);
			bt_sair = (ImageView) findViewById(R.imgV.bt_sair);
			bt_sobre = (ImageView) findViewById(R.imgV.bt_sobre);
		}
		
		public void defineEvents(){
		bt_iniciar.setOnClickListener(new View.OnClickListener(){			
			
			
			public void onClick(View arg0) {			 
				startActivity(new Intent(InicioActivity.this, Choice.class));
						 
			}
		});
		
		bt_sair.setOnClickListener(new View.OnClickListener(){
			
			public void onClick(View arg0) {			 
				System.exit(0);
			}
		});
		

		bt_sobre.setOnClickListener(new View.OnClickListener(){			
			
			
			public void onClick(View arg0) {			 
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						context);

					
					alertDialogBuilder.setTitle("        Informativo");
					alertDialogBuilder		
					
						.setIcon(R.drawable.bt_sobre)		
						.setMessage("Informacoes")
						.setCancelable(false)
						.setNegativeButton("OK",new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,int id) {
								
								dialog.cancel();
							}
							
						});
					AlertDialog popUpInformativo = alertDialogBuilder.create();
					
					popUpInformativo.show();
					}
				});

}

}
