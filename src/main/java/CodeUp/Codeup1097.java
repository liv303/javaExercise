package CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        //배열 만들기 19*19
        int[][] arr = new int[19][19];

        //n개의 좌표를 입력 받아 배열에 할당하기
        Scanner sc = new Scanner(System.in);
        int xLoc, yLoc;

        for (int i = 0; i < 19; i++) {
            xLoc = i;
            for (int j = 0; j < 19; j++) {
                yLoc = j;
                arr[i][j] = sc.nextInt();
            }
        }

        //십자 뒤집기
        int cycle = sc.nextInt();
        for (int k = 1; k <= cycle; k++) {
            xLoc = sc.nextInt();
            yLoc = sc.nextInt();

            for (int i = 1; i < 20; i++) {  // i행
                if (xLoc == i) {
                    for (int j = 1; j < 20; j++) {  // j열
                        if (yLoc == j) {
                            arr[i][yLoc] = arr[i][yLoc] == 1 ? 0 : 1; // xLoc 행 뒤집기
                            arr[xLoc][j] = arr[xLoc][j] == 1 ? 0 : 1; // yLoc 열 뒤집기
                        }
                    }


                } else {
                    continue;
                }

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
