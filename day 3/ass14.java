public class ass14 {
    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        System.out.println("Leaders:");

        int leader = arr[arr.length - 1];
        System.out.print(leader + " ");

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] > leader) {
                leader = arr[i];
                System.out.print(leader + " ");
            }
        }
    }
}