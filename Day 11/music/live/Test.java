/*Write another class Test in a package called live. Then,
a. Create an instance of Veena and call play() method
b. Create an instance of Saxophone and call play() method
c. Place the above instances in a variable of type Playable and then call play()*/
package music.live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args){
        Veena b = new Veena();
        b.play();
        Saxophone c = new Saxophone();
        c.play();
        Playable ob = new Veena();
        ob.play();
        Playable ob1 = new Saxophone();
        ob1.play();
    }
}
