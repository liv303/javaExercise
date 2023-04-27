package week2.day4.ComparisonOperator;

import java.util.Arrays;

public class ComparisonArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 7, 9};

        System.out.printf("%d > %d --> %b\n", arr[0], arr[1], arr[0] > arr[1]);
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
