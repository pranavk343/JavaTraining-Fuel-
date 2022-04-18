/*
  a. Create an instance of Veena and call play() method
  b. Create an instance of Saxophone and call play() method
  c. Place the above instances in a variable of type Playable and then call play()
*/
package music.live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args){
        Veena v1 = new Veena();
        v1.play();
        Saxophone s1 = new Saxophone();
        s1.play();
        if(v1 instanceof Playable){
            v1.play();
        }
        else if(s1 instanceof Playable){
            s1.play();
        }
    }
}
