package week2.day3.arrays;

import java.util.Arrays;
/* 한 행에 값을 모두 채우기    */
public class TwoDimArrFillRow {
    public static void main(String[] args) {
        // 5*5 배열 선언 후 생성
        int[][] arr = new int[5][5];


        // 2행 값 채우기
        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;
        arr[2][3] = 1;
        arr[2][4] = 1;


        // 결과 출력하기
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
    }
}
