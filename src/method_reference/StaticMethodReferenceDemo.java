package method_reference;

@FunctionalInterface
interface Addition{
    void add(int a, int b);
}
public class StaticMethodReferenceDemo {
    public static void add1(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Addition additionOne = StaticMethodReferenceDemo::add1;
        Addition addtiontwo = (int a, int b) -> System.out.println(a+b);
        additionOne.add(1,2);
        addtiontwo.add(2,3);
    }
}
