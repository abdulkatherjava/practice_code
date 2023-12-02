package leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int num = 20;
        Set<Integer> set = new HashSet<>();
        while (num != 1 && !set.contains(num)) {

            set.add(num);
            num = calculateSumOfSquares(num);
            System.out.println(num);
        }
        System.out.println(num == 1);
    }

    private static int calculateSumOfSquares(int num) {
        int temp = 0, newNum = 0;
        while (num > 0) {
            temp = num % 10;
            temp = temp * temp;
            num = num / 10;
            newNum += temp;
        }
        return newNum;
    }
}
