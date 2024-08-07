package first_source;
//https://leetcode.com/problems/count-unique-characters-of-all-substrings-of-a-given-string/

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Let's define a function countUniqueChars(s) that returns the number of unique characters in s.
 *
 * For example, calling countUniqueChars(s) if s = "LEETCODE" then "L", "T", "C", "O", "D" are the unique characters since they appear only once in s, therefore countUniqueChars(s) = 5.
 * Given a string s, return the sum of countUniqueChars(t) where t is a substring of s. The test cases are generated such that the answer fits in a 32-bit integer.
 *
 * Notice that some substrings can be repeated so in this case you have to count the repeated ones too.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ABC"
 * Output: 10
 * Explanation: All possible substrings are: "A","B","C","AB","BC" and "ABC".
 * Every substring is composed with only unique letters.
 * Sum of lengths of all substring is 1 + 1 + 1 + 2 + 2 + 3 = 10
 * Example 2:
 *
 * Input: s = "ABA"
 * Output: 8
 * Explanation: The same as example 1, except countUniqueChars("ABA") = 1.
 * Example 3:
 *
 * Input: s = "LEETCODE"
 * Output: 92
 */
public class FirstSource_16_10_23 {
    public static void main(String[] args) {
        String s = "ABC";
        int count = 0;
        for(int i =0; i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                count +=  counting(s.substring(i,j)) ;
            }
        }
        System.out.println("count: "+ (count));
    }

    public static int counting(String s){
        System.out.println("s:"+s);
        long count = s.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(c -> c.getValue() == 1)
                .mapToInt(entry -> entry.getKey()).count();
        System.out.println(count);
    return (int)count;

    }
}
