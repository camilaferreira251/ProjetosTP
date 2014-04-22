/*Classe ScorePersistence  
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

import java.util.ArrayList;
import fga.mds.abcdario.R;

public class ScorePersistence {

	private static ScorePersistence instance;
	ArrayList<ScoreModel> cadastreImgStars = new ArrayList<ScoreModel>();

	private ScorePersistence() {
	}

	public static ScorePersistence getInstance() {
		if (instance == null)
			instance = new ScorePersistence();

		return instance;
	}

	public int criaEarmazenaArrayListDeImagens() {

		ScoreModel img0Star = new ScoreModel(0, R.drawable.img_0_estrelas);
		ScoreModel img1Star = new ScoreModel(1, R.drawable.img_1_estrela);
		ScoreModel img2Star = new ScoreModel(2, R.drawable.img_2_estrelas);
		ScoreModel img3Star = new ScoreModel(3, R.drawable.img_3_estrelas);
		ScoreModel img4Star = new ScoreModel(4, R.drawable.img_4_estrelas);
		ScoreModel img5Star = new ScoreModel(5, R.drawable.img_5_estrelas);

		cadastreImgStars.add(img0Star);
		cadastreImgStars.add(img1Star);
		cadastreImgStars.add(img2Star);
		cadastreImgStars.add(img3Star);
		cadastreImgStars.add(img4Star);
		cadastreImgStars.add(img5Star);

		if (cadastreImgStars.isEmpty())
			return -1;

		return 0;

	}

	public int getModelImagemEstrela(int nome) {

		return cadastreImgStars.get(nome).getStarImage();

	}
}
