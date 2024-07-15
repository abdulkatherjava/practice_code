package TAO_Digital_09_02_24;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int[] subArr = {8};

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
        System.out.println(isSubArray);
    }
}
