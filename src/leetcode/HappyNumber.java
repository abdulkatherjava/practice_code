package leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int num = 19;
        Set<Integer> set = new HashSet<>();
        while (!(set.contains(num) || num == 1) ) {
            set.add(num);
            num = calculateSumOfSquares(num);
            System.out.println(num);
        }
        System.out.println(num == 1);
    }

    private static int calculateSumOfSquares(int num) {
        int newNum = 0;
        while (num > 0) {
            newNum += Math.pow(num % 10, 2);
            num /= 10;
        }
        return newNum;
    }
}
