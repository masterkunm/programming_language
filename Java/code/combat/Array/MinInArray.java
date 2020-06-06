package Array;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int min = 100;
        for (int i = 0; i < 5; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("最小值为：" + min);
    }
}