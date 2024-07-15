package interview;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1, 3,5,5,5,5,5, 5, 7, 7, 8, 8, 8, 8, 8};

        // Assuming the array is sorted, if not, you may need to sort it first

        int uniqueCount = 0;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is the same as the previous one
            if (i == 0 || arr[i] != arr[i - 1]) {
                // If not, copy the current element to the appropriate position in the array
                arr[uniqueCount++] = arr[i];
            }
        }

        // Printing the array without duplicates
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
