package week3.day3.Factor;

import java.util.Scanner;

/*  입력 값의 절반의 범위 안에 소수가 있는지 판별하기    */
public class PrimeSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = "prime";

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) result = "not prime";
        }


        System.out.println(result);
    }
}
