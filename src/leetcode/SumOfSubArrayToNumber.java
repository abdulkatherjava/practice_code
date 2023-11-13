package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given an integer n, return the number of ways you can write n as the sum of consecutive positive integers.
 * Input: n = 5
 * Output: 2
 * Explanation: 5 = 2 + 3
 * Example 2:
 * Input: n = 9
 * Output: 3
 * Explanation: 9 = 4 + 5 = 2 + 3 + 4
 * Example 3:
 */
public class SumOfSubArrayToNumber {
    public static void main(String[] args) {
        int num = 6;
        List<Integer> array = new LinkedList<>();
        ArrayList<List<Integer>> list = new ArrayList<>();

        for (int j = 1; j <= num; j++) {
            int sum = 0;
            array = new ArrayList<>();
            for (int i = j; i <= num / 2 + 1; i++) {

                sum += i;
                if (sum > num) {
                    break;
                }
                array.add(i);
                if (sum == num) {
                    list.add(array);
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
