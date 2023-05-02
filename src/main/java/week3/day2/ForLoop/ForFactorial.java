package week3.day2.ForLoop;

import java.util.Scanner;

public class ForFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 1; // 곱하기 연산은 0부터 시작할 수 없음


        for (int i = n; i >= 1; i--) {
            answer *= i;
        }
        System.out.println(answer);
    }
}
