import java.util.ArrayList;
import java.util.List;

public class lambda {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        
        // Iterate using lambda expression
        names.forEach(name -> System.out.println("Hello, " + name));
    }
}
