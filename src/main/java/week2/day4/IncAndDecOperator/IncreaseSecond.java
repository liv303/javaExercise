package week2.day4.IncAndDecOperator;

public class IncreaseSecond {
    public static void main(String[] args) {
        int idx = 0;
        int[] arr = {2, 1, 7, 4};
        System.out.println(arr[idx]);   // 출력 값: 2
        System.out.println(arr[++idx]); // index 1증가 후 출력. 출력 값 1, 위치 arr[1]
        System.out.println(arr[idx++]); // arr[1] 출력 후 index 1 증가. 출력 값 1, 위치 arr[2]
        System.out.println(arr[++idx]); // index 1 증가 후 출력. 출력 값 7, 위치 arr[3]
    }
}
