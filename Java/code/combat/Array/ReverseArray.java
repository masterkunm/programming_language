package Array;

public class ReverseArray {
    public static void main(final String[] args) {
        final int[] arr = new int[5];
        // randomise
        for (int i = 0; i < 5; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i]);
        }

        int i = 0, j = arr.length - 1;
        while (i < j) {
            final int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        for (int k : arr) {
            System.out.println(k);
        }
    }
}