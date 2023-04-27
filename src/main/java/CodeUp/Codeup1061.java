package CodeUp;
/*  두 정수를 입력 받아 비트 단위로 OR 하여 그 결과를 정수로 출력   */
import java.util.Scanner;

public class Codeup1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        int result = val1 | val2;
        System.out.println(result);
    }
}

/*
입력된 정수 두 개를 비트단위로 or 연산한 후 그 결과를 정수로 출력해보자.
비트단위(bitwise) 연산자 |(or, vertical bar, 버티컬바)를 사용하면 된다.


** | 은 파이프(pipe)연산자라고도 불리는 경우가 있다.

** 비트단위(bitwise) 연산자는,
~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor),
<<(bitwise left shift), >>(bitwise right shift)
가 있다.
 */