/*Class LearnLetter
 * 	Abcdario is free software: you can redistribute it and / or

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

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import fga.mds.abcdario.R;

public class LetterLearn extends Activity{

	private LearnController controller;	
	
	private ImageView nextButton, previousButton, backButton, soundButton, image; 
	private Intent it;
	private Bundle params;
	private String letter;
	private int id[] = new int[2];
	private MediaPlayer music;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.aprender); 	
        
        initializeComponents(null);
        defineEvents();
    }

	public void initializeComponents(String letter) {
		
		controller = new LearnController();
		
		nextButton = (ImageView) findViewById(R.id.bt_proximo);
		previousButton = (ImageView) findViewById(R.id.bt_anterior);
		backButton = (ImageView) findViewById(R.id.bt_voltar);
		soundButton = (ImageView) findViewById(R.id.bt_som);
		image = (ImageView) findViewById(R.id.imagem_selecionada);
		
		if(letter == null){
			letter = obtainParameter();
		}
		
		else {
			// nothing to do here
		}
		id = controller.defineLetter(letter);
		
		defineImage(id[0]);
		defineAudio(id[1]);
	}

	private void defineAudio(int id) {
		music = MediaPlayer.create(this, id);
	}

	private void defineImage(int id) {
		image.setImageResource(id);
	}

	private String obtainParameter() {
		
		it = getIntent();
		params = it.getExtras();
		
		letter = params.getString("OK");
		
		return letter;
	}

	public void defineEvents() {
		
		backButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(LetterLearn.this, LearnAbc.class));
			}
		});
		
		soundButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				music.start();
			}
		});
		
		nextButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});
		
		previousButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			}
		});
	}
}
