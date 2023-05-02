package week2.day5.controlStatement.operatorIf;

import java.util.Arrays;

public class AutoSwap {
    public static void main(String[] args) {
        //오름차순 정렬
        int i = 0;
        int[] arr = {2, 1, 7, 9};
        boolean check = arr[i] > arr[i + 1];

        //loop
        if (check) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
