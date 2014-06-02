/*Class LearnAbc
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

package fga.mds.abcdario.view;

import jogo.AbstractActivity;
import jogo.GridLetters;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;
import fga.mds.abcdario.R;

public class LearnAbc extends AbstractActivity {

	private ImageView backButton;

	private GridView gridView;

	// This is the first function to be executed when an Activity is launched
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grade_letras);
	}

	// Initializes the components used in activity
	public void initializeComponents() {
		backButton = (ImageView) findViewById(R.id.bt_voltar);
		gridView = (GridView) findViewById(R.id.aprender_grade);

		gridView.setAdapter(new GridLetters(this));
	}

	// Defines the events of activity
	public void defineEvents() {
		backButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				startActivity(new Intent(LearnAbc.this, SelectModeABC.class));

			}
		});

		gridView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {

				Intent i = new Intent(getApplicationContext(),
						LetterLearn.class);
				i.putExtra("id", position);
				startActivity(i);
			}
		});
	}

}
