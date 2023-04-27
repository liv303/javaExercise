package CodeUp;

import java.util.Scanner;

/*  두 정수를 입력 받아 비트 다뉘로 XOR 연산한 후 그 결과를 정수로 출력   */
public class Codeup1062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int result = val1 ^ val2;

        System.out.println(result);
    }
}

/*
비트단위(bitwise) 연산자 ^(xor, circumflex/caret, 서컴플렉스/카릿)를 사용하면 된다.

** 주의 ^은 수학식에서 거듭제곱(power)을 나타내는 기호와 모양은 같지만,
C언어에서는 전혀 다른 배타적 논리합(xor, 서로 다를 때 1)의 의미를 가진다.

** 비트단위(bitwise) 연산자는,
~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor),
<<(bitwise left shift), >>(bitwise right shift)
가 있다.
 */