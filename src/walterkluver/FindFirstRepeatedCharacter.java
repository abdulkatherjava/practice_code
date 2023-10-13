package walterkluver;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedCharacter {
    public static void main(String[] args) {
        String input = "JJava Articles are Awesome";

        Character key = input.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(map -> map.getValue() > 1)
                .findFirst().get().getKey();
        System.out.println("First Repeated Character:"+ key);

    }
}
