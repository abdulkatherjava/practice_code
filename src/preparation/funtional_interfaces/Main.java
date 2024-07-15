package preparation.funtional_interfaces;

public class Main implements FuntionalInterfacesDemo{

    @Override
    public Integer add(int a, int b) {
        return a+b;
    }
    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {

        FuntionalInterfacesDemo obj =  (int a, int b) -> a+b;

        int val = obj.add(1,3);
        Integer multiply = obj.multiply(1, 4);
        System.out.println();
        System.out.println("default method");
        System.out.println("static method");

        FuntionalInterfacesDemo.divide(1,3);

        FuntionalInterfacesDemo instance = FuntionalInterfacesDemo::divide;
        

    }
}
