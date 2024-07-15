package interview;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 7, 8, 8,8,8,8};
        System.out.println(Arrays.toString(arr));
        int val = removeDuplicates(arr);
        int[] ints = Arrays.copyOf(arr, val);
        System.out.println(Arrays.toString(ints));
    }

    private static int removeDuplicates(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[index] != arr[i]) {
                index++;
                arr[index] = arr[i];
            }
        }

        return index;
    }

}

