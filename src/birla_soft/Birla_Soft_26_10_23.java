package birla_soft;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * filter the even number from the given list and multiply the each element by 2
 */
public class Birla_Soft_26_10_23 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list = numbers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .collect(Collectors.toList());

        list.forEach(System.out::print);
    }
}
