package preparation.funtional_interfaces;

@FunctionalInterface
public interface FuntionalInterfacesDemo {
     abstract public Integer add(int a, int b);

    public default Integer multiply(int a, int b) {
        return a*b;
    }

    public static Integer divide(int a, int b) {
        return a/b;
    }
}
