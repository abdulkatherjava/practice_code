package preparation.sam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,32,45,3);
        int [] arr = {1,34,5,8,6};
        List<Integer> collect = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    }
}
