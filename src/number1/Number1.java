package number1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;
public class Number1 {
    public static void main(String[] args) {
        Set<String> str= new LinkedHashSet<>();
        Stream<String> stream = str.stream();
       str.add("a");
       str.add("b");
       str.add("c");
        stream.forEach(System.out::println);
    }
}
