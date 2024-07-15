package zafin;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class zafin_1_1123 {
    public static void main(String[] args) {
        String str = "jjjjavkak";
//        List<Character> collect = str.chars()
//                .mapToObj(ch -> (char) ch)
//                .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()))
//                .entrySet().stream()
//                .filter(map -> map.getValue() > 1)
//                .map(map -> map.getKey())
//                .collect(Collectors.toList());

//        List<Character> collect = str.chars()
//                .mapToObj(ch -> (char) ch)
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet().stream()
//                .filter(map -> map.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());

        List<String> collect = str.toLowerCase()
                .chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .map(String::valueOf)
                .collect(Collectors.toList());


        System.out.println(collect);

    }
}
