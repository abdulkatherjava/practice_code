package encora_07_02_24;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        int [] arr = {2,46,74,67,23,68,98,23};

        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println("-----------------------------------");
        Arrays.stream(arr)
                .boxed()
                .filter(e -> e.toString().startsWith("7") )
                .forEach(System.out::println);
        System.out.println("-----------------------------------");

        String str = "I am a worker";
        String key = Arrays.stream(str.split(" "))
                .collect(
                        Collectors.groupingBy(Function.identity(),
                                HashMap::new,
                                Collectors.summingInt(String::length)))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .filter(val -> val.getValue() % 2 == 0)
                .findFirst()
                .get().getKey();
        System.out.println(key);
    }
}
