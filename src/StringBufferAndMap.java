import java.util.HashMap;
import java.util.Map;

public class StringBufferAndMap {
    public static void main(String[] args) {
        Map<StringBuilder, String> map = new HashMap<>();
        StringBuilder sb1 = new StringBuilder("str1");
        map.put(sb1,"test1");

        StringBuilder sb2 = new StringBuilder("str2");
        map.put(sb2,"test2");

        StringBuilder sb3 = new StringBuilder("str3");
        map.put(sb3,"test3");

        map.keySet().stream().forEach(System.out::print);
    }

}
