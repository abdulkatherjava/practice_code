package encora_07_02_24;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main1 {
    public static void main(String[] args) {
        String s = "here1 akj a";

        String key = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(
//                        Function.identity()
                x->x
                        , HashMap::new, Collectors.summingInt(String::length)
                )).entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .filter(entry -> entry.getValue() % 2 == 1)
                .findFirst().get().getKey();
        System.out.println(key);

        String key1 = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.summingInt(String::length)))
                .entrySet().stream()
                .filter(x -> x.getValue() % 2 == 0)
                .findFirst().get().getKey();

        int[] arr = {1,4,5,6,4};
        List<Integer> collect = Arrays.stream(arr)
                .boxed()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect);

        IntStream.rangeClosed(0,9).filter(x -> x%3 == 0);
    }
}
