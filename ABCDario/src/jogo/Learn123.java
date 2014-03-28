	/*Classe aprender_123
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

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;
import fga.mds.abcdario.R;

public class Learn123 extends AbstractActivity{

	private ImageView bt_back;
	private GridView gridView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grade_numeros); 
      }

	@Override
	public void initializeComponents() {
		
		 bt_back = (ImageView) findViewById(R.id.bt_voltar);
		 gridView = (GridView) findViewById(R.id.aprender_grade);
		 
		 gridView.setAdapter(new GridNumbers(this));
	}

	@Override
	public void defineEvents() {
		
		bt_back.setOnClickListener(new View.OnClickListener(){
	    	  
	    	  public void onClick(View arg0) {			 
	    		  startActivity(new Intent(Learn123.this, Escolha_modo_123.class));
	    	  }
	    });
		
		gridView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                    int position, long id) {
 
                Intent i = new Intent(getApplicationContext(), LearnNumber.class);
                i.putExtra("id", position);
                startActivity(i);
            }
        });
	}
}
