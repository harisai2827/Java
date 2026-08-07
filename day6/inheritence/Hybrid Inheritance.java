// Parent interface
interface Animal {
    void eat();
}

// Child interface
interface Pet extends Animal {
    void play();
}

// Another parent interface
interface Guard {
    void protect();
}

// Class implementing both interfaces
class Dog implements Pet, Guard {

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void play() {
        System.out.println("Dog is playing");
    }

    public void protect() {
        System.out.println("Dog is protecting the house");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.play();
        d.protect();
    }
}
