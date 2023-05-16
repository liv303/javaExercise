package week5.day1;
/*  버블정렬02 튜닝: loop 1회 돌때마다 가장 큰 값은 다음 loop에서 제외함   */
import java.util.Arrays;

public class BubbleSort02T1 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        for (int j = 1; j <= arr.length; j++) {  // loop 범위 변경: 1부터 arr.length까지
            for (int i = 0; i < arr.length - j; i++) {  //종료 조건 변경: length - j
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

