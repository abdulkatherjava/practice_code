package TAO_Digital_09_02_24;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5,4};
        int[] subArr = {3, 5};

        boolean isSubArray = false;

        for (int i = 0; i <= arr.length - subArr.length; i++) {
            boolean isMatch = true;
            for (int j = 0; j < subArr.length; j++) {
                if (arr[i + j] != subArr[j]) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                isSubArray = true;
                break;
            }
        }

        if (isSubArray) {
            System.out.println("subArr is a contiguous subarray of arr.");
        } else {
            System.out.println("subArr is not a contiguous subarray of arr.");
        }
    }
}
