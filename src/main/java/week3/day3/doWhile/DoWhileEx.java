package week3.day3.doWhile;
import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int num;
        do {
            //System.out.println("숫자를 입력해 주세요.");
            num = sc.nextInt();
            System.out.println(num);
        } while (num != 0); // while 값이 true이면 계속 do를 반복 실행
    }
}
