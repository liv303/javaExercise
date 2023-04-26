package week2.day3.arrays;

import java.util.Arrays;

public class DefineArr2 {
    public static void main(String[] args) {
        int[] iArr = new int[]{1, 2, 3, 8};
        System.out.println("iArr[0]: " + iArr[0]);

        int[][] arr32 = new int[3][2];
        int[][] arr67 = new int[6][7];

        // 3 * 3
        int[][] arr2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        System.out.println(Arrays.toString(arr2[0]));
        System.out.println(Arrays.toString(arr2[1]));
        System.out.println(Arrays.toString(arr2[2]));

        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);
    }
}
