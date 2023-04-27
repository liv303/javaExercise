package CodeUp;

import java.util.Scanner;

/*  입력된 세 정수 a, b, c 중 가장 작은 값을 출력하는 프로그램을 작성해보자.
    단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.    */
public class Codeup1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        int result = ((val1 > val2) ? val2 : val1) > val3 ? val3 : ((val1 > val2) ? val2 : val1);

        System.out.printf("%d\n", result);
    }
}
