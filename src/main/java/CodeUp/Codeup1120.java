package CodeUp;

import java.util.Scanner;

/*  입력 받은 세 정수의 평균 출력하기 */
public class Codeup1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        float avg = ((float)num1 + (float)num2 + (float)num3) / 3;
        System.out.printf("%.2f", avg);
    }
}
