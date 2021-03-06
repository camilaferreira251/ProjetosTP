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

package fga.mds.abcdario.view;

/*
 * This class was create to set the screen of Number's game mode and its define the 
 * possibles interactions between user and this part of the software
 */

import fga.mds.abcdario.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class SelectMode123 extends Activity {
	
	private ImageView bt_back, bt_learn, bt_play;

	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_123);
		
		InitializeComponents();
		definirEventos();
	}

	private void InitializeComponents() {
		bt_back = (ImageView) findViewById(R.imgV.bt_voltar);
		bt_learn = (ImageView) findViewById(R.imgV.bt_aprender);
		bt_play = (ImageView) findViewById(R.imgV.bt_jogar);
					
	}
	
	private void definirEventos() {
		bt_back.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				startActivity(new Intent(SelectMode123.this, Select.class));
				
			}
		});
		
		bt_learn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				startActivity(new Intent(SelectMode123.this, Learn123.class));
				
			}
		});
		
		bt_play.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				startActivity(new Intent(SelectMode123.this, NumberGame.class));
				
			}
		});
	}
}
