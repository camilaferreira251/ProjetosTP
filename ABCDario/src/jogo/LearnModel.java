/*Class LearnModel
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

/* This class was created to instantiate the parameters of LearnModel */
public class LearnModel {

	private String name;
	private int image;
	private int audio;

	public LearnModel(String name, int image, int audio) {
		this.name = name;
		this.image = image;
		this.audio = audio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

	public int getAudio() {
		return audio;
	}

	public void setAudio(int audio) {
		this.audio = audio;
	}
}
