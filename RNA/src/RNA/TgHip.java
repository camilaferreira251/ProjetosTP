/*	Class TgHip
 * RNA is free software: you can redistribute it and / or

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

package RNA;

public class TgHip extends Function{
       public final double function (double x) {
        return ((Math.exp(x)-Math.exp(-x))/(Math.exp(x)+Math.exp(-x)));
    }

    public final double derived(double x) {
        return 1-Math.pow(function(x), 2);
    }
}
