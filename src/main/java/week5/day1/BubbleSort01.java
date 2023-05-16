package week5.day1;

import java.util.Arrays;

public class BubbleSort01 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

                System.out.println(Arrays.toString(arr));
            } else System.out.println(Arrays.toString(arr));
        }


    }
}
