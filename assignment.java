/*

This is what I have so far. I have put it all into a single file, hopefully for convenience. 

*/


//----------------------------------------------------------
//----------------------------------------------------------

/*      animal package     */

package animal;

public interface Animal {
    public String Speak();
    default public String defaultSpeak() {
        System.out.println("This animal does not speak");
    return Speak();
    }
}



//----------------------------------------------------------

/*      carnivore package     */

package animal.carnivore;
import animal.Animal;

public class Lion implements Animal {
    public String Speak() {
        Animal String speak = new Speak();
        return speak;
    }
}



//----------------------------------------------------------

/*     Herbivore package     */

package animal.herbivore;
import animal.*;

public class Giraffe implements Animal {
    public String Speak() {
        String speak = "";
        return speak;
    }
}



//----------------------------------------------------------

/*     final package     */

package panowicz.katherine; 
import animal.*;
import animal.carnivore.*;
import animal.herbivore.*;

class Main {
    public void main (String args[]) {
        String getLion = (Lion.Speak());
        String getGiraffe = (Giraffe.Speak());
        System.out.println(getLion);
        System.out.println();
        System.out.println(getGiraffe);
        System.out.println();
    }
}

