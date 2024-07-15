package interview;

import java.util.*;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,45,89,0,3);
        List<Integer> collect = list.stream()
                .sorted(Integer::compareTo)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
