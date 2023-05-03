package CodeUp;

import java.util.Scanner;

public class Codeup1620 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        // While1: 자릿수의 합 구하기
        int sum = 0;

        while (input > 0) {
            sum += input % 10;    // iVal의 일의 자리 수를 더함
            input /= 10; // iVal을 10으로 나누어 일의 자리 수를 없앰
        }

        // While2: 각 자릿수의 합이 한 자리가 될 때까지 반복
        while (sum >= 10) {
            int temp = sum;
            sum = 0;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }

        System.out.println(sum);


    }
}