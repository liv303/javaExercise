package CodeUp;

import java.util.Scanner;

/*  정수 2개(a, b)를 입력 받아 2^n 곱한 값으로 출력하기(shift 연산)  */
public class Codeup1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b= sc.nextInt();
        int result = a << b;

        System.out.println(result);
    }
}
