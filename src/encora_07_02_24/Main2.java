package encora_07_02_24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        int[] arr = {23, 13,67,17,56};

        List<Integer> collect = Arrays.stream(arr)
                .boxed()
                .filter(e -> e.toString().startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
