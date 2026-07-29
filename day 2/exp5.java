import java.util.Scanner;

public class exp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("It is an Alphabet.");
        } 
        else if (ch >= '0' && ch <= '9') {
            System.out.println("It is a Number.");
        } 
        else {
            System.out.println("It is a Special Character.");
        }

        sc.close();
    }
}