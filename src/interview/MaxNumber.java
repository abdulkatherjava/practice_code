package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,45,56,54);

//        Integer integer = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        Integer please_check_the_input = list.stream()
                .max( Integer::compare)
                .orElseThrow(() -> new RuntimeException("Please check the input"));

        int [] arr = {3,1,7,8,4};
        int maxNumber = Arrays.stream(arr).boxed().max(Integer::compare).orElseThrow(() -> new RuntimeException("error"));
        System.out.println(maxNumber);
        System.out.println(please_check_the_input);
    }
}
