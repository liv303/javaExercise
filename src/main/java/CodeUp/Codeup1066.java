package CodeUp;

import java.util.Scanner;

public class Codeup1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int[] arr = new int[3];
        arr[0] =sc.nextInt();
        arr[1] =sc.nextInt();
        arr[2] =sc.nextInt();

        for (i = 0; i < arr.length; i++) {
            if ( arr[i] % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

    }
}
