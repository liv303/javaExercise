package week2.day3.remainder;

import java.util.Scanner;

public class MinuteSecondEx {
    public static void main(String[] args) {
        System.out.println("초를 입력해 주세요: ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();


        int minute = val / 60;
        int second = minute % 60;


        System.out.printf("%d시 %d초", minute, second);

    }
}
