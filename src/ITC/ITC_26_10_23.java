package ITC;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class ITC_26_10_23 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        intList.stream()
                .filter(num -> num > 5)
                .skip(1) // Skip the first element (index 0), which is the second element
                .limit(2) // Limit to the next two elements (second and third)
                .forEach(System.out::println);

    }
}
