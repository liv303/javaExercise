package CodeUp;

import java.util.Scanner;

public class Codeup1039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 2개 입력받기(공백 구분): 2147483648 2147483648 입력
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();

        // 두 정수의 합 계산하기
        long sum = num1 + num2;

        // 결과 출력하기
        System.out.println(sum);

        scanner.close();
    }
}
