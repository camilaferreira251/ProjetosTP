package jogo;

import fga.mds.abcdario.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.GridLayout.LayoutParams;

public class GradeNumeros extends BaseAdapter{

	private Context contexto;
	

    public Integer[] botoesNumeros = {
   		R.drawable.bt_1,R.drawable.bt_2,R.drawable.bt_3,R.drawable.bt_4,R.drawable.bt_5,
   		R.drawable.bt_6,R.drawable.bt_7,R.drawable.bt_8,R.drawable.bt_9,
    };
    
    public GradeNumeros(Context c){
    	this.contexto = c;
    }
	
	@Override
	public int getCount() {
        return botoesNumeros.length; 
	}

	@Override
	public Object getItem(int posicao) {
    	return botoesNumeros[posicao];  
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}
	
	@Override
	public View getView(int posicao, View convertView, ViewGroup parent) {
		
		ImageView imageView = new ImageView(contexto);
        imageView.setImageResource(botoesNumeros[posicao]);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setLayoutParams(new GridView.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
        
        return imageView;
	}

}
