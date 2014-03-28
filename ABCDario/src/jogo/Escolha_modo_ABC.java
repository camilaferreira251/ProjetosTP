/*Classe Escolha_modo_ABC
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

public class Escolha_modo_ABC extends Activity {

	private ImageView bt_voltar, bt_aprender, bt_jogar;

	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_abc);


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
				startActivity(new Intent(Escolha_modo_ABC.this, Choice.class));

			}
		});


		bt_aprender.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				startActivity(new Intent(Escolha_modo_ABC.this, Aprender_ABC.class));

			}

		});

		bt_jogar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				startActivity(new Intent(Escolha_modo_ABC.this, GameLetter.class));
			}

		});

	}

}