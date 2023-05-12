package week4.day1;

import java.util.Scanner;

/* 구구단을 입력 받아 *로 출력하기   */
public class Codeup1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < input*i; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
