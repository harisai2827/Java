public class ass24 {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 3};

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Descending Order: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}