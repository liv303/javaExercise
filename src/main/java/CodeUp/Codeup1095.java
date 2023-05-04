package CodeUp;
/*
배열 size와 출석 번호들을 입력 받고,
입력받은 배열의 값 중에서 최소값 구하기
 */
import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size + 1];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int targetValue = arr[0];
        for (int i = 0; i < size; i++) {
            if (targetValue > arr[i]) targetValue = arr[i];
        }

        System.out.printf("%d ", targetValue);
    }
}
