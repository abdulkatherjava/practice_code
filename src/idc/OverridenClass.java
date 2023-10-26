package idc;

public class OverridenClass {
    public static void main(String[] args) {
        Printable objParent = new Parent();
        objParent = (Parent) objParent;
        objParent.sysout();
//        objParent.displayName();
    }
}

interface Printable {
    void sysout();
}

class Parent implements Printable {
    public void displayName() {
        System.out.println("This is Parent Name");
    }
    public void sysout() {
        System.out.println("I am Printable Interfacein Parent Class");
    }
}