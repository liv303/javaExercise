package week5.day2;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d  j:%d  j-1:%d\n", i, j, j-1);
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
