package CodeUp;

import java.util.Scanner;

public class Codeup1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char val = sc.next().charAt(0);

        int ascii = (int) val + 1;
        char result = (char) ascii;

        System.out.println(result);
    }
}

/*
Q. 이 코드에서 .charAt(0)을 쓰지 않으면 안 될까?
A. 'Scanner' 클래스의 'next()' 메소드는 공백 이전까지의 문자열을 입력 받아 변환합니다.
예를 들어 "Hello World"를 입력 받을 경우 'next()' 메소드는 "Hello"만 반환하고,
"World"는 다음 "next()" 호출 시 읽힙니다.

따라서 'val' 변수에 sc.next()' 메소드를 사용하면 사용자가 입력한 문자열의 츳 번째 문자가 아니라
공백 이전까지의 문자열 중 첫 번째 문자가 저장되빈다. 이를 해결하기 위해 'charAt(0)' 메소드를
사용하여 문자열에서 첫 번째 문자를 추출해야 합니다.

즉, 'charAt(0)'을 사용하지 않으면 사용자가 입력한 문자열에서 첫 번째 문자가 아닌 다른 문자가
'val' 변수에 저장됩니다. 따라서 'charAt(0)'을 사용하여 문자열에서 첫 번째 문자를 추출하는 것
이 필요합니다.
 */

/*

 */