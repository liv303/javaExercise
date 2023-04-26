package CodeUp;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        long sum = num1 + num2 + num3;

        System.out.println(num1 + num2 + num3);
        System.out.printf("%.1f", (float) sum / 3);
    }
}
