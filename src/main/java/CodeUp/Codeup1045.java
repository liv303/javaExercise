package CodeUp;

import java.util.Scanner;

public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int minus = num1 - num2;
        int multi = num1 * num2;
        int quote = num1 / num2;
        int remain = num1 % num2;
        float fQoute = (float) num1 / num2;

        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multi);
        System.out.println(quote);
        System.out.println(remain);
        System.out.printf("%.2f", fQoute);
        //(float) 강제 형변환 말고 *1.0도 가능
    }
}
