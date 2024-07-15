package Wipro_09_02_24;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int[] a = {1,1, 2, 4, 5,17};
        int[] b = {0,3, 5, 10, 2,2};
        int l = a.length;
        List<BigDecimal> list = new ArrayList<>();
        for (int i=0; i<a.length; i++) {
            BigDecimal x = new BigDecimal(a[i]).setScale(5);
            BigDecimal y = new BigDecimal(b[i]).setScale(5);
            if (y.compareTo(new BigDecimal(0)) > 0)
            try {
                System.out.println(x+" "+y);
                System.out.println(x.divide(y));
                list.add(x.divide(y));
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

        int value = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<BigDecimal, Long>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .findFirst().get().getValue().intValue();
        System.out.println(value);
    }
}
