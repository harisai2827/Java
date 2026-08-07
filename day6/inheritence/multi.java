// Interface 1
interface Father {
    void work();
}

// Interface 2
interface Mother {
    void cook();
}

// Child class implementing both interfaces
class Child implements Father, Mother {

    public void work() {
        System.out.println("Father's work");
    }

    public void cook() {
        System.out.println("Mother's cooking");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Child c = new Child();

        c.work();
        c.cook();
    }
}
