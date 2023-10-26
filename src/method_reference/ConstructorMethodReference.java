package method_reference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

interface multiplication {
    void multiplication();
}
public class ConstructorMethodReference {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bca");
        list.add("abc");

        Set<String> setOne = new HashSet<>(list);



    }
}
