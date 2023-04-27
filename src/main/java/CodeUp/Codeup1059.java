package CodeUp;
/*  입력 된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력    */
import java.util.Scanner;

public class Codeup1059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        System.out.println(~val);   // bitwise : '~'
    }
}
