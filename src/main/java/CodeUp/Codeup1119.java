package CodeUp;

import java.util.Scanner;
/*  day 입력하면 hour로 환산하기 */
public class Codeup1119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int hour = day * 24;

        System.out.printf("%d", hour);
    }
}
