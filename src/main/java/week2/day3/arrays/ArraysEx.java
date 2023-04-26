package week2.day3.arrays;

import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {
        int[][] arr02x03 = new int[2][3];    // 2행 3열의 2차원 배열 생성(배열 선언 후 초기화)
        int[][] arr10x10 = new int[10][10];


        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(arr10x10[i]));
        }
    }
}
