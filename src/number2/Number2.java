package number2;

import java.util.LinkedHashSet;
import java.util.Set;


public class Number2 {
    public static void main(String[] args) {
    Set<String> stringSet = new LinkedHashSet<>();
    stringSet.add("abcdtfghijrlm");
    stringSet.add("aaa");
    stringSet.add("bbbbbbbbbb"); //здесь ровно 10 элементов
    stringSet.stream()
            .filter(str -> str.length() <=10)
            .forEach(str -> System.out.println(str));
}
}


