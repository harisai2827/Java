// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // Inherited from Animal
        d.bark();  // Dog's own method
    }
}
