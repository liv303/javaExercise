package week2.day5.controlStatement.operatorIf;

import java.util.Scanner;

public class PrintPromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt();
        int projectCnt = sc.nextInt();

        if ( years > 5 || projectCnt > 10 ) {
            System.out.println("팀장 승진 대상입니다.");
        } else {
            System.out.println("팀장 승진 대상이 아닙니다.");
        }
    }
}
