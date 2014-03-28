/*Class Choice
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

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import fga.mds.abcdario.R;

public class Information extends AbstractActivity {

	private ImageView backButton;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.informacao);

		initializeComponents();
		defineEvents();
	}

	public void initializeComponents() {
		backButton = (ImageView) findViewById(R.imgV.bt_voltar);
	}

	public void defineEvents() {

		backButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {
				startActivity(new Intent(Information.this, InicioActivity.class));

			}
		});

	}
}
