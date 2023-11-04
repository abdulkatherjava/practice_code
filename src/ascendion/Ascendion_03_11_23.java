package ascendion;

import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Find the duplicate element in the character in the String
 */
public class Ascendion_03_11_23 {
    public static void main(String[] args) {
        String str = "java cuckoo";
        str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(character -> character, () -> new HashMap<>(), Collectors.counting()))
                //.collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(map -> map.getValue() > 1)
                .forEach(map -> System.out.println(map.getKey()));
    }
}

