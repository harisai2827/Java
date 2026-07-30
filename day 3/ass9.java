import java.util.Scanner;

public class ass9 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 20, 50};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int key = sc.nextInt();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        System.out.println("Occurrences = " + count);

        sc.close();
    }
}