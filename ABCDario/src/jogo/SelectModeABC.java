/*Class SelectModeABC
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
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class SelectModeABC extends Activity {

	private ImageView backButton, learnButton, playButton;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_abc);

		initializeComponents();
		defineEvents();

	}

	private void initializeComponents() {
		backButton = (ImageView) findViewById(R.imgV.bt_voltar);
		learnButton = (ImageView) findViewById(R.imgV.bt_aprender);
		playButton = (ImageView) findViewById(R.imgV.bt_jogar);
	}

	private void defineEvents() {

		backButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				startActivity(new Intent(SelectModeABC.this, Select.class));

			}
		});

		learnButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				startActivity(new Intent(SelectModeABC.this, LearnAbc.class));

			}

		});

		playButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				startActivity(new Intent(SelectModeABC.this, LetterGame.class));
			}

		});

	}

}