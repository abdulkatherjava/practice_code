import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = new String("come on let's break the shit world");
        System.out.println("Hello world!");
        List<String> forbiddenWords1 = Arrays.asList("shit");
        List<String> forbiddenWords2 = Arrays.asList("shit");
        List<String> forbiddenWords3 = Arrays.asList("shit");

        checkForbiddenWords(s, forbiddenWords1);
    }
     private static void checkForbiddenWords(String s, List<String> forbiddenWords) {

        boolean isFound = forbiddenWords.stream()
                .anyMatch(fw -> s.contains(fw));
        if(isFound){
            throw new IllegalStateException("forbidden words found");
        }
         System.out.println("not foud");
     }
}