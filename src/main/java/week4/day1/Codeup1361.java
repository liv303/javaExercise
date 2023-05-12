package week4.day1;
/*
별 계단 만들기
입력: 3
출력:
 **
  **
   ***
 */
import java.util.Scanner;

public class Codeup1361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            System.out.println("**");
        }

    }
}
