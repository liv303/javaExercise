package week5.day1;
/*  OOP 적용: sortARound(), sort(), main() 기능 분리  */

import java.util.Arrays;

public class BubbleSort02T2 {
    //sortARound() : 1 round 정렬
    public int[] sortARound(int[] arr, int until) { // until 파라미터 사용
        for (int i = 0; i < until; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr; // 변수로 주고 받으므로 return
    }


    public int[] sort(int[] arr) {
        for (int j = 1; j <= arr.length; j++) {
            arr = sortARound(arr, arr.length - j);  // arr.length - j 를 until 파라미터로 전달
        }
        return arr;
    }


    // main() : 객체 생성, 호출
    public static void main(String[] args) {
        BubbleSort02T2 bubbleSort = new BubbleSort02T2();
        int[] arr = {7, 2, 3, 9, 28, 11};

        arr = bubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}

