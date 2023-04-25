package CodeUp;

import java.util.Scanner;

public class Codeup1033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();

        String hexa = Integer.toHexString(decimal);

        System.out.println(hexa.toUpperCase());
    }
}
/*
- 해설: 10진수 -> 16진수
  int iDecimal = sc.nextInt();
  String hexadecimal = Integer.toHexString(iDecimal);

- 해설: 10진수 -> 16진수, 대문자로
  16진수 대문자 FF -> printf(“%X”) 도 된대여 굳!😀
  .toUpperCase() → 대문자로 바꾸기 (오늘 배울 String 클래스의 기능)
 */