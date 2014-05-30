/*Class Select
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

import fga.mds.abcdario.R;
import fga.mds.abcdario.view.SelectMode123;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class Select extends Activity {

	private ImageView numbersButton, lettersBbutton, backButton;

	// This is the first function to be executed when an Activity is launched
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.escolha);

		initializeComponents();
		defineEvents();
	}

	// Initializes the components used in activity
	public void initializeComponents() {
		numbersButton = (ImageView) findViewById(R.imgV.bt_123);
		lettersBbutton = (ImageView) findViewById(R.imgV.bt_abc);
		backButton = (ImageView) findViewById(R.imgV.bt_voltar);
	}

	// Defines the events of activity
	public void defineEvents() {
		numbersButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {
				startActivity(new Intent(Select.this, SelectMode123.class));

			}
		});

		lettersBbutton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {
				startActivity(new Intent(Select.this, SelectModeABC.class));

			}
		});

		backButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {
				startActivity(new Intent(Select.this, FirstActivity.class));

			}
		});

	}
}
