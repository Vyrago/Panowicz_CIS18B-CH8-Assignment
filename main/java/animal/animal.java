package animal;

public interface Animal {
 
    default String speak() {
        return "This animal does not speak";
    };
}
