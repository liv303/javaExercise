package CodeUp;

import java.util.Scanner;

public class Codeup1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int grade = sc.nextInt();
        int ordinalNumber = sc.nextInt();
        int answer = start;


        for (int i = 1; i < ordinalNumber; i++) {
            answer += grade;
        }

        System.out.println(answer);
    }
}
