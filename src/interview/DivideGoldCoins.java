package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideGoldCoins {
    public static void main(String[] args) {
        int[] coins = {1,1,2,7,3,4,1}; // Example array of gold coin weights

        List<Integer> firstThief = new ArrayList<>();
        List<Integer> secondThief = new ArrayList<>();

        if (divideCoins(coins, coins.length, 0, 0, 0, firstThief, secondThief)) {
            System.out.println("First thief's coins: " + firstThief);
            System.out.println("Second thief's coins: " + secondThief);
        } else {
            System.out.println("Equal division not possible.");
        }
    }

    public static boolean divideCoins(int[] coins, int n, int index, int sum1, int sum2, List<Integer> thief1, List<Integer> thief2) {
        if (index == n) {
            return sum1 == sum2;
        }

        if (sum1 == sum2 && sum1 != 0) {
            for (int i = index; i < n; i++) {
                thief2.add(coins[i]);
            }
            return true;
        }

        thief1.add(coins[index]);
        if (divideCoins(coins, n, index + 1, sum1 + coins[index], sum2, thief1, thief2)) {
            return true;
        }
        thief1.remove(thief1.size() - 1);

        thief2.add(coins[index]);
        if (divideCoins(coins, n, index + 1, sum1, sum2 + coins[index], thief1, thief2)) {
            return true;
        }
        thief2.remove(thief2.size() - 1);

        return false;
    }
}
