package method_reference;

@FunctionalInterface
interface Substraction{
    void substraction(int a, int b);
}
public class InstanceMethodReference {
    static void substraction(int a, int b) {
        System.out.println(a-b);
    }
    public static void main(String[] args) {
        InstanceMethodReference object = new InstanceMethodReference();
//        Substraction substraction = object::substraction;
        Substraction substraction = InstanceMethodReference::substraction;
        substraction.substraction(20, 10);
    }
}
