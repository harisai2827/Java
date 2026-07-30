public class ass19 {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 4, 0, 5};

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.print("Result: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}