/*Class ScoreModel
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

package fga.mds.abcdario.model;

public class ScoreModel {

	public int amount;
	public int starImage;

	public ScoreModel(int amount, int starImage) {
		setStarImage(starImage);
		setAmount(amount);
	}

	public int getAmout() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getStarImage() {
		return starImage;
	}

	public void setStarImage(int starImage) {
		this.starImage = starImage;
	}

}
