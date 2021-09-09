/*
For this project we will show an understanding of packages, interfaces, and default implementations

 

1. Create a package called animal

2. Inside the animal package, create two more packages called carnivore and herbivore

3. Inside the animal package, create an interface called Animal that has one method called "speak" that returns a string.  Create a default implementation  for this method that returns "This animal doesn't speak";

4. Inside the carnivore package, create a class called Lion that implements the Animal interface.  Implement the "speak" method returning a string that says "The lion roars!"

5. Inside the herbivore package, create a class called Giraffe that implements the Animal interface.  Do not create an implementation for the "speak" method.

6. At the root of the project, create another package called <your last name>.<your first name>

7. Inside this package create a class called Main

8. Inside the Main class, instantiate one instance of the Lion class and one instance of the Giraffe class.  Use System.out.printl to output the speak method for both of these objects.

Your output should look like this:

    The lion roars!

    This animal can't speak


To receive credit, put all your source code into a Github repository and submit the url to your repository

You are allowed as many attempts as you need for this project up till the due date.  If you have questions or need any help, upload the files you have and leave a comment asking for help.  I will see it when I am grading and use the comments section to work with you.
*/


//----------------------------------------------------------
//----------------------------------------------------------



/* 
Inside the animal package, create two more packages called carnivore and herbivore

Inside the animal package, create an interface called Animal that has one method called "speak" that returns a string.  Create a default implementation  for this method that returns "This animal doesn't speak"; */

package animal;

public interface Animal {
    public String Speak();
    default public String defaultSpeak() {
        System.out.println("This animal does not speak");
    return Speak();
    }
}



//----------------------------------------------------------

/* Inside the carnivore package, create a class called Lion that implements the Animal interface.  Implement the "speak" method returning a string that says "The lion roars!" */

package animal.carnivore;
import animal.Animal;

public class Lion implements Animal {
    public String Speak() {
        Animal String speak = new Speak();
        return speak;
    }
}




//----------------------------------------------------------

/* Inside the herbivore package, create a class called Giraffe that implements the Animal interface.  Do not create an implementation for the "speak" method. */

package animal.herbivore;
import animal.*;

public class Giraffe implements Animal {
    public String Speak() {
        String speak = "";
        return speak;
    }
}



/* 6. At the root of the project, create another package called <your last name>.<your first name>

7. Inside this package create a class called Main

8. Inside the Main class, instantiate one instance of the Lion class and one instance of the Giraffe class.  Use System.out.printl to output the speak method for both of these objects. */

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





/*
NOTES:



*/