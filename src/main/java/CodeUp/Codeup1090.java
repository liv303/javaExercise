package CodeUp;
/*  등비 수열   */
import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int ratio = sc.nextInt();
        int ordinal = sc.nextInt();
        long answer = start; //int형을 쓰면 overflow 발생

        for (int i = 1; i < ordinal; i++) {
            answer *= ratio;
        }

        System.out.println(answer);
    }
}
