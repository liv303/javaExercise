package week2.day3.arrays;

import java.util.Arrays;

public class TwoDimArrayRefactoring {

    // 메소드로 refactoring(logic 변화 없이 구조 바꿈). parameter
    public static void printArray(int[][] arr) {    // Heap 영역은 Heap 영역 내에서만 접근 가능하므로 Static 영역에 메소드를 올려야 함
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]) + "\n");
    }

    public static void main(String[] args) {
        int[][] arr3 = new int[3][2];

        arr3[0][0] = 0;
        arr3[0][1] = 2;

        printArray(arr3);   // printArray 메소드 호출
    }
}



