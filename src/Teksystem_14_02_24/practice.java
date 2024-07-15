package Teksystem_14_02_24;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class practice {
    public static void main(String[] args) {
        String[] strArr = {"apple", "mango", "dates","mango", "dates"};
        Set<String> strSet = new HashSet<>();
//        List<String> collect =
                Arrays.stream(strArr)
                .filter(x -> !strSet.add(x))
                .forEach(System.out::println);
//                .collect(Collectors.toList());
//        System.out.println(collect);collect

//        collect.stream().forEach(System.outstanding::print);


        List<String> collect = Arrays.stream(strArr)
                .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(value -> value.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(collect);



    }
}
