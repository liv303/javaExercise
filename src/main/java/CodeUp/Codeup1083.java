package CodeUp;

import java.util.Scanner;

/*  중첩 for문 */
public class Codeup1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            switch (i) {
                case 3, 6, 9 -> System.out.printf("X ");
                default -> System.out.printf("%d ", i);
            }
        }
    }
}
