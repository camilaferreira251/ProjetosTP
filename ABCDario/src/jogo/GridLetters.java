/*Classe LettersGrid
 * Abcdário is free software: you can redistribute it and / or

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
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.GridLayout.LayoutParams;

public class GridLetters extends BaseAdapter {

	private Context context;

	// Iniciando botoes na grade
	public Integer[] buttonsLetters = { R.drawable.bt_a, R.drawable.bt_b,
			R.drawable.bt_c, R.drawable.bt_d, R.drawable.bt_e, R.drawable.bt_f,
			R.drawable.bt_g, R.drawable.bt_h, R.drawable.bt_i, R.drawable.bt_j,
			R.drawable.bt_k, R.drawable.bt_l, R.drawable.bt_m, R.drawable.bt_n,
			R.drawable.bt_o, R.drawable.bt_p, R.drawable.bt_q, R.drawable.bt_r,
			R.drawable.bt_s, R.drawable.bt_t, R.drawable.bt_u, R.drawable.bt_v,
			R.drawable.bt_x, R.drawable.bt_z, R.drawable.bt_w, R.drawable.bt_y, };

	public GridLetters(Context c) {
		this.context = c;
	}

	@Override
	public int getCount() {
		return buttonsLetters.length;
	}

	@Override
	public Object getItem(int positon) {
		return buttonsLetters[positon];
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ImageView imageView = new ImageView(context);
		imageView.setImageResource(buttonsLetters[position]);
		imageView.setScaleType(ImageView.ScaleType.FIT_XY);
		imageView.setLayoutParams(new GridView.LayoutParams(
				LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));

		return imageView;
	}

}
