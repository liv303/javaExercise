package week3.day3.Factor;

import java.util.Scanner;
/*
입력된 숫자의 약수의 합 구하기
약수란 1과 자기 자신 이외의 다른 수로 나누어지지 않는 수입니다.
*/
public class SumOfFactors {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        //약수 합 구하기
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        System.out.printf("%d의 약수의 합: %d ", num, sum);
    }


}
