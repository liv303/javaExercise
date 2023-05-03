package week3.day3.Factor;
import java.util.Scanner;

/*  약수 구하기   */
public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            System.out.printf("%d %% %d\n", input, input % i);  // %% 쓰기
        }
    }
}
