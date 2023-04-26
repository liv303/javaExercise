package week2.day3.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;


public class TwoDimArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[] arr0 = arr[0];    // 1행을 꺼냄(1차원 배열)
        int[] arr1 = arr[1];
        arr0[0] = 1;    // arr0의 첫 번째 칸에 값을 할당
        arr1[2] = 12;

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]) + "\n");


        arr[0][0] = 00;
        arr[0][2] = 02;
        arr[1][0] = 10;

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]) + "\n");
    }

}
