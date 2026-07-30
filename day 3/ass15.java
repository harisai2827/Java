public class ass15 {
    public static void main(String[] args) {

        int[] arr = {-7, 1, 5, 2, -4, 3, 0};

        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {

            totalSum -= arr[i];

            if (leftSum == totalSum) {
                System.out.println("Equilibrium Index = " + i);
                return;
            }

            leftSum += arr[i];
        }

        System.out.println("No Equilibrium Index");
    }
}