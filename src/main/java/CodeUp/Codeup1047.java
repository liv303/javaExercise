package CodeUp;

import java.util.Scanner;
/*  정수 1개를 입력 받아 2배 곱하여 출력(shift 연산 사용)  */
public class Codeup1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int result = num << 1;  //shift 연산: <<(왼쪽으로 1bit), >>(오른쪽으로 1bit)
        System.out.println(result);
    }
}
