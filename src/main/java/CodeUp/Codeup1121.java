package CodeUp;

import java.util.Scanner;
/*  입력 받은 두 정수의 나머지를 출력하기   */
public class Codeup1121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        float remain = (float)num1 % (float)num2;

        System.out.printf("%s", (int)remain);
    }
}
