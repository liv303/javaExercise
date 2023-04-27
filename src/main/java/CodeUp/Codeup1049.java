package CodeUp;

import java.util.Scanner;

/*  두 정수 a, b를 입력 받아 a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력(비교, 관계 연산자 사용) */
public class Codeup1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();

        System.out.println(iVal1 > iVal2 ? 1: 0);   //삼항 연산자: true면 : 앞의 숫자, false면 : 뒤의 숫자 출력

    }
}
