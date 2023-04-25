package CodeUp;

import java.util.Scanner;

public class Codeup1031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int octal = sc.nextInt();
        System.out.printf("%o", octal);
    }
}

/*
해설: 10진수 -> 8진수
  int iDecimal = sc.nextInt();
  String octal = Integer.toOcatalString(iDecimal);
 */
