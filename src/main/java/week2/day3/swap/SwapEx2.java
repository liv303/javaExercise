package week2.day3.swap;

import java.util.Arrays;

public class SwapEx2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        arr[1][0] = 1;
        arr[1][1] = 2;
        arr[1][2] = 3;

        // 인접한 값 자리 바꾸기(버블 정렬)
        int temp = arr[1][0];
        arr[1][0] = arr[1][1];
        arr[1][1] = temp;

        System.out.println("temp: " + temp);
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }
}
