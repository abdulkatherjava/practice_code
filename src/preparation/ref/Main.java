package preparation.ref;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Reference of type Animal, object of type Dog
        animal.sound(); // Dynamic binding: Calls sound() method of Dog class at runtime
    }
}
