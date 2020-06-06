package Array;

public class SortArray {
    static int len = 5;
    public static void main(final String[] args) {
        
        int[] arr = new int[len];
        // randomise
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i]);
        }
        
        System.out.println();

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }
}