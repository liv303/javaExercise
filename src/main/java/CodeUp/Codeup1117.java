package CodeUp;

import java.util.Scanner;
/*  두 실수를 입력받아 두 실수의 곱을 출력하되 소수 둘째자리까지 출력하시오.   */
public class Codeup1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float fVal1 = sc.nextFloat();
        float fVal2 = sc.nextFloat();

        float multi = fVal1 * fVal2;

        System.out.printf("%.2f", multi);
    }
}
