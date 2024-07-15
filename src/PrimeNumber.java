import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        Integer number = scanner.nextInt();

        System.out.println(IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0));
        System.out.println(isPrime(number));
    }

    private static boolean isPrime(Integer number) {
        return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
    }
}
