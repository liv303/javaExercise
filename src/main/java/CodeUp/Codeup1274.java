package CodeUp;
/*  소수 판별하기   */
import java.util.Scanner;

public class Codeup1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String answer = "prime";


        for (int i = 2; i < input; i++) {
            if (input % i == 0) answer = "not prime";
        }


        System.out.println(answer);
    }
}
