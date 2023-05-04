package CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        //배열 만들기 19*19
        int[][] arr = new int[19][19];

        //n개의 좌표를 입력 받아 배열에 할당하기
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        //십자 뒤집기
        int cycle = sc.nextInt();
        for (int k = 1; k <= cycle; k++) {
            int xLoc = sc.nextInt() - 1;    // 좌표는 1부터 시작하므로 -1
            int yLoc = sc.nextInt() - 1;

            for (int i = 0; i < arr.length; i++) {  // x행 뒤집기: y열 고정
                arr[xLoc][i] = arr[xLoc][i] == 1 ? 0 : 1;
            }

            for (int i = 0; i < arr.length; i++) {  // y열 뒤집기: x열 고정
                arr[i][yLoc] = arr[i][yLoc] == 1 ? 0 : 1;
            }


        }

        // 결과 출력하기
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
