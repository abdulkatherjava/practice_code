package interview;

import java.util.Arrays;

public class SumJava8 {
    public static void main(String[] args) {
        int [] arr = {2,4,7,3};
        Integer integer = Arrays.stream(arr)
                .boxed()
                .reduce((a, b) -> a + b).get();
        System.out.println(integer);
    }
}
