package zafin;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class zafin_1_1123 {
    public static void main(String[] args) {
        String str = "java";
        str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(map -> map.getValue() > 1)
                .forEach(map -> System.out.print(map.getKey()));
        }
}
