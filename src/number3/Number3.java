package number3;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Number3 {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();
        Stream<Integer> stream = numbers.stream();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(11);
        stream.sorted().forEach(System.out::println);

    }

}

