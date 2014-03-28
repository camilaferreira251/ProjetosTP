package jogo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;
import fga.mds.abcdario.R;

public class Aprender_ABC extends AbstractActivity{

	private ImageView bt_voltar;
	private GridView gridView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grade_letras);
      }
	
	@Override
	public void initializeComponents() {
		bt_voltar = (ImageView) findViewById(R.id.bt_voltar);
		gridView = (GridView) findViewById(R.id.aprender_grade);
		   
        gridView.setAdapter(new GradeLetras(this));
	}

	@Override
	public void defineEvents() {
		bt_voltar.setOnClickListener(new View.OnClickListener(){
	    	  
	    	  public void onClick(View arg0) {			 
	    		  startActivity(new Intent(Aprender_ABC.this, Escolha_modo_ABC.class));
	    		  
	    	  }
	      });
		
		gridView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                    int position, long id) {
 
                Intent i = new Intent(getApplicationContext(), AprenderLetra.class);
                i.putExtra("id", position);
                startActivity(i);
            }
        });
	}

}
