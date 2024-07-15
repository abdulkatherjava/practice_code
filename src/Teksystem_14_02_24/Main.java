package Teksystem_14_02_24;


import java.util.*;
// same as colan info tech L2 round
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 4,5, 7,2};
        int target = 9;
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
            if (set.contains(target - num)) {
                System.out.println("(" + (target - num) + "," + num + ")");
            }
        } 
    }

  
}
