package CodeUp;

import java.util.Scanner;

public class Codeup1055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.printf("%d", ( val1 == 1 || val2 == 1 ) ? 1 : 0);
    }
}
