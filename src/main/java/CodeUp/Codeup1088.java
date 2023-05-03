package CodeUp;

import java.util.Scanner;

public class Codeup1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {

            if (i % 3 != 0) {
                System.out.printf("%d ", i);
            } else {
                continue;
            }
        }
    }
}
