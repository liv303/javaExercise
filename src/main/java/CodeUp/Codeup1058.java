package CodeUp;

import java.util.Scanner;

public class Codeup1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        boolean isZero = val1 == 0 && val2 == 0;

        System.out.printf("%d", isZero  ? 1 : 0 );
    }
}
