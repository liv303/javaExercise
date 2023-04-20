package com.example.javaExcercise.week1.day4;

import java.util.Scanner;

public class ScannerForamtting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 두 개를 입력하세요: ");
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.printf("%d와 %d의 합은 %d 입니다.", val1, val2, val1 + val2);
    }
}
