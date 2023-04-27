package week2.day4.LogicalOperator;

import java.util.Scanner;

public class LogicalOperatorEx {
    public static void main(String[] args) {
        System.out.printf("나이를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        boolean inStudent = false;

        if (age >= 18 && !inStudent) {
            System.out.println("성인이며 학생이 아닙니다.");
        } else if (age >= 18 && inStudent) {
            System.out.println("성인이며 학생입니다.");
        } else if (age < 18) {
            System.out.println("미성년자이며 학생입니다.");
        }
    }
}
