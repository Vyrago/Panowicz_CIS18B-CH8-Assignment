package panowicz.katherine;
import animal.*;
import animal.carnivore.*;
import animal.herbivore.*;

class Main {
    public static void main (String args[]) {
        Lion lion = new Lion();
        Giraffe giraffe = new Giraffe();
        
        System.out.println(lion.speak());
        System.out.println(giraffe.speak());
    }
}
