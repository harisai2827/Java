import java.util.Scanner;

public class exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Maximum number = " + a);
        } else {
            System.out.println("Maximum number = " + b);
        }

        sc.close();
    }
}