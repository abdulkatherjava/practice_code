package leetcode;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345; // Replace this with the number you want to reverse

        int reversedNumber = reverseNumber(number);

        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    // Method to reverse a number
    private static int reverseNumber(int num) {
        int reversedNum = 0;

        while (num != 0) {
            reversedNum = reversedNum * 10 + num%10;
            num /= 10;
        }

        return reversedNum;
    }
}
