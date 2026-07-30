import java.util.Scanner;

public class ass8 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");

        sc.close();
    }
}