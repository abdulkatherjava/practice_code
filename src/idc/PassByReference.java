package idc;

import java.util.ArrayList;
import java.util.List;

public class PassByReference {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("main-test1");
        list.add("main-test2");
        PassByReference o = new PassByReference();
        o.test1(list);
//        System.out.println(list.get(2));
//        String s="abc";
        String s=new String("abc");
        o.test2(s);
        System.out.println(s);
    }

    private void test2(String sub) {
        sub = "xyz";
    }

    private void test1(List<String> list) {
//        list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
    }

}
