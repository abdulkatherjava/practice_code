import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value");
        String str = scanner.nextLine();
        System.out.println("Number of vowels in the String: "+ findVowels(str));
    }
//    private static long findVowels(String str) {
//        return str.chars()
//                .filter(ch -> (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))
//                .count();
//    }

//    private static int findVowels(String str) {
//        int count = 0;
//        for (char ch : str.toCharArray()) {
//            if ("aeiouAEIOU".indexOf(ch) != -1) {
//                count++;
//            }
//        }
//        return count;
//    }

    private static long findVowels(String str) {
        return str.chars()
                .filter(ch -> "aeiouAEIOU".indexOf(ch) >= 0)
                .count();
    }

}
