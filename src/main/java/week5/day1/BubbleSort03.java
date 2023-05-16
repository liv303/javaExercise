package week5.day1;

import java.util.Arrays;

public class BubbleSort03 {
    public int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort03 bubbleSort = new BubbleSort03();
        int[] arr = {7, 2, 3, 9, 28, 1};

        arr = bubbleSort.sort(arr);

        System.out.println(Arrays.toString(arr));


    }
}
