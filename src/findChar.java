import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class findChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = "abdul kather";//scanner.nextLine();
        int a = 011;
        System.out.println((0*8^2)+(1*8^1)+(1*8^0));
        System.out.println(a);

        Character character = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
//                .map(entry -> entry.getKey())
                .findFirst().get().getKey();
        System.out.println("first char : "+ character);

    }
    
}
