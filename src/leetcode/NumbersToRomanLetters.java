package leetcode;

import java.util.TreeMap;

/**
 * Number to Roman Letter
 * Input: 123
 * Output: CXXIII
 * Explanation: Convert the given number to Roman Letters
 */

//        1000, "M"
//        900, "CM"
//        500, "D"
//        400, "CD"
//        100, "C"
//        90, "XC"
//        50, "L"
//        40, "XL"
//        10, "X"
//        9, "IX"
//        5, "V"
//        4, "IV"
//        1, "I"

public class NumbersToRomanLetters {

    private static final TreeMap<Integer, String> valueMap = new TreeMap<>();

    static {
        valueMap.put(1000, "M");
        valueMap.put(900, "CM");
        valueMap.put(500, "D");
        valueMap.put(400, "CD");
        valueMap.put(100, "C");
        valueMap.put(90, "XC");
        valueMap.put(50, "L");
        valueMap.put(40, "XL");
        valueMap.put(10, "X");
        valueMap.put(9, "IX");
        valueMap.put(5, "V");
        valueMap.put(4, "IV");
        valueMap.put(1, "I");
    }

    public static void main(String[] args) {
        System.out.println(numbersTORomanLetters(99));
    }

    private static String numbersTORomanLetters(Integer number) {
        Integer tempValue = valueMap.floorKey(number);
        if (number == tempValue) {
            return valueMap.get(tempValue);
        }
        return valueMap.get(tempValue) + numbersTORomanLetters(number - tempValue);
    }
}
