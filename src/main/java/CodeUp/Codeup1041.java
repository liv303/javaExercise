package CodeUp;

import java.util.Scanner;

public class Codeup1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char val = sc.next().charAt(0);

        int ascii = (int) val + 1;
        char result = (char) ascii;

        System.out.println(result);
    }
}
