package week3.day3.Factor;

import java.util.Scanner;

public class PrimeSearch2Sqrt {
    /*  입력 값의 root n 범위 안에 소수가 있는지 판별하기    */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = "prime";

        for (int i = 2; i <= Math.sqrt(num); i++) { // root : Math.sqrt()
            if (num % i == 0) result = "not prime";
        }


        System.out.println(result);
    }


}
