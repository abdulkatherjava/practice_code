package interview;

import java.util.Arrays;

public class Pratice1 {
    public static void main(String[] args) {
        int [] arr = {1,4,6,8};

        double asDouble = Arrays.stream(arr)
                .boxed()
                .mapToInt(e -> e * e)
                .average()
                .getAsDouble();
        System.out.println(asDouble);

    }
}
