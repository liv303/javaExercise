package week5.day2;
/*  InsertionSort 튜닝    */
import java.util.Arrays;

public class InsertionSortT1 {
    // desc --> 내림차순
    // asc --> 오름차순
    public int[] sort(int[] arr, boolean isAscending) {   // OOP 적용: 기능 분리
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d  j:%d  j-1:%d\n", i, j, j-1);
                if ((isAscending ? arr[j - 1] - arr[j] : arr[j] - arr[j - 1]) > 0) {  // 변경: 오름차순 -> 내림차순
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else break;   // 오름차순 정렬 상태이므로 더 이상 교환이 안될 때 break;
            }
        }
        return arr;
    }


    public int[] sort(int[] arr){ // 메소드 오버로딩
        return sort(arr, true);
    }


    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        InsertionSortT1 is = new InsertionSortT1();
        arr = is.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
