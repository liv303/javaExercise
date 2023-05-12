package week4.day1;

import java.util.Scanner;

/*  별 출력하기   */
public class Codeup1256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            System.out.printf("*");
            /*
            System.out.println("*".repeat(input));  //.repeat(): 반복. JAVA 11부터 적용
             */
        }
    }
}
