package ColanInfotech1_13_02_24;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] str = {"audi2", "benz4", "thar5", "maruthi2", "toyoto5", "sumo4"};
//        List<String> list = Arrays.asList(str);
//        Map<Integer, String> collect = list.stream()
//                .collect(Collectors.toMap(s -> Integer.parseInt(String.valueOf(s.charAt(s.length()-1))),
//                        s -> s.substring(0, s.length() - 1),
//                        (oldStr, newStr) -> oldStr + "," + newStr
//                ));
//        System.out.println(collect);


        Map<Integer, String> collect = Arrays.stream(str)
                .collect(Collectors.toMap(s -> Integer.parseInt(String.valueOf(s.charAt(s.length() - 1))),
                        s -> s.substring(0, s.length() - 1),
                        (oldStr, newStr) -> oldStr + "," + newStr
                ));

        System.out.println(collect);

    }
}
