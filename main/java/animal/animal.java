package animal;

public interface Animal {
 
    default String Speak() {
        return "This animal does not speak";
    };
}
