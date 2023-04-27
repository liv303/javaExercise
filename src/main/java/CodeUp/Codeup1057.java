package CodeUp;

import java.util.Scanner;

public class Codeup1057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        boolean isDifferent = val1 != val2;
        System.out.printf("%d", !isDifferent ? 1 : 0 ); // !(not)
    }
}
