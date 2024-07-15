package walterkluver;

import sun.awt.image.ImageWatched;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedCharacter {
    public static void main(String[] args) {
        String input = "JAjwesome";

        Character key = input.toLowerCase().chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .findFirst()
                .get().getKey();

        System.out.println(key);

    }
}
