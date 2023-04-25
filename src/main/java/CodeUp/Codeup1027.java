package CodeUp;

import java.util.Scanner;

public class Codeup1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] timeArr = str.split("\\.");

        int year = Integer.parseInt(timeArr[0]);
        int month = Integer.parseInt(timeArr[1]);
        int day = Integer.parseInt(timeArr[2]);

        System.out.printf("%02d-%02d-%04d", day, month, year);
    }
}
