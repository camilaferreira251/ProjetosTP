/*Classe LearnLetter
 * 	Abcd�rio is free software: you can redistribute it and / or

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

public class LearnLetter extends Activity{

	private AprenderController controller;	
	
	private ImageView bt_proximo, bt_anterior, bt_voltar, bt_som, imagem; 
	private Intent it;
	private Bundle params;
	private String letra;
	private int id[] = new int[2];
	private MediaPlayer musica;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.aprender); 	
        
        inicializarComponentes(null);
        definirEventos();
    }

	public void inicializarComponentes(String letra) {
		
		controller = new AprenderController();
		
		bt_proximo = (ImageView) findViewById(R.id.bt_proximo);
		bt_anterior = (ImageView) findViewById(R.id.bt_anterior);
		bt_voltar = (ImageView) findViewById(R.id.bt_voltar);
		bt_som = (ImageView) findViewById(R.id.bt_som);
		imagem = (ImageView) findViewById(R.id.imagem_selecionada);
		
		if(letra == null)
			letra = obterParamentro();
		
		id = controller.definirLetra(letra);
		
		definirImagem(id[0]);
		definirAudio(id[1]);
	}

	private void definirAudio(int id) {
		musica = MediaPlayer.create(this, id);
	}

	private void definirImagem(int id) {
		imagem.setImageResource(id);
	}

	private String obterParamentro() {
		
		it = getIntent();
		params = it.getExtras();
		
		letra = params.getString("OK");
		
		return letra;
	}

	public void defineEvents() {
		
		bt_voltar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(LearnLetter.this, LearnAbc.class));
			}
		});
		
		bt_som.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				musica.start();
			}
		});
		
		bt_proximo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});
		
		bt_anterior.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			}
		});
	}
}
