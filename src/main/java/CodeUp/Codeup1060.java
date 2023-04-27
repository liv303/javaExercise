package CodeUp;
/*  두 정수를 입력 받아 비트 단위로 AND 하여 그 결과를 정수로 출력   */
import java.util.Scanner;

public class Codeup1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int result = val1 & val2;

        System.out.println(result);
    }
}

/*
입력된 정수 두 개를 비트단위로 and 연산한 후 그 결과를 정수로 출력해보자.
비트단위(bitwise)연산자 &를 사용하면 된다.(and, ampersand, 앰퍼센드라고 읽는다.)

** 비트단위(bitwise)연산자는,
~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor),
<<(bitwise left shift), >>(bitwise right shift)
가 있다.
 */