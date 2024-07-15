import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedChar {
    public static void main(String[] args) {
        System.out.println("  Please  enter  the  input  string  :");
        Scanner in = new Scanner(System.in);    // read from System input
        String input = in.nextLine();
        Character firstNonRepeatedChar = logic(input);
        System.out.println("The  first  non  repeated  character  is  :    " + firstNonRepeatedChar);
        in.close();
    }

    private static Character logic(String input) {
        Character character = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(val -> val.getValue() == 1)
                .findFirst().get().getKey();
       return character;
    }
}
