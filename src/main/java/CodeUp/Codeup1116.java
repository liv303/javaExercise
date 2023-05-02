package CodeUp;

import java.util.Scanner;
/*  사칙 연산 출력    */
public class Codeup1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int plus = num1 + num2;
        int minus = num1 - num2;
        int multi = num1 * num2;
        int devide = num1 / num2;


        System.out.println(num1 + "+" + num2 + "=" + plus);
        System.out.println(num1 + "-" + num2 + "=" + minus);
        System.out.println(num1 + "*" + num2 + "=" + multi);
        System.out.println(num1 + "/" + num2 + "=" + devide);
    }
}
