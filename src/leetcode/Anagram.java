package leetcode;

import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "ton";
        String s2 = "noT";

        Map<Character, Long> map1 = s1.chars()
                .mapToObj(ch -> (char) Character.toUpperCase(ch))
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        Map<Character, Long> map2 = s2.chars()
                .mapToObj(ch -> (char) Character.toUpperCase(ch))
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        if(map1.equals(map2)) {
            System.out.println("It's Anagram");
        } else {
            System.out.println("it's not Anagram");
        }
    }
}
