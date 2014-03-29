/*Classe ChooseMode123
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

public class ChooseMode123 extends Activity {
	
	private ImageView bt_voltar, bt_aprender, bt_jogar;

	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_123);
		
		inicializarComponetes();
		definirEventos();
	}

	private void inicializarComponetes() {
		bt_voltar = (ImageView) findViewById(R.imgV.bt_voltar);
		bt_aprender = (ImageView) findViewById(R.imgV.bt_aprender);
		bt_jogar = (ImageView) findViewById(R.imgV.bt_jogar);
					
	}
	
	private void definirEventos() {
		bt_voltar.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				startActivity(new Intent(ChooseMode123.this, Choice.class));
				
			}
		});
		
		bt_aprender.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				startActivity(new Intent(ChooseMode123.this, Aprender_123.class));
				
			}
		});
		
		bt_jogar.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				startActivity(new Intent(ChooseMode123.this, JogoNumero.class));
				
			}
		});
	}
}
