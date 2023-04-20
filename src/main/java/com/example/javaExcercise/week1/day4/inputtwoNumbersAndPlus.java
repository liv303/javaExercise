package com.example.javaExcercise.week1.day4;

import java.util.Scanner;

public class inputtwoNumbersAndPlus {
    public static void main(String[] args) {
        System.out.println("더 할 숫자를 두 개 입력해 주세요(enter로 구분): ");
        Scanner sc = new Scanner(System.in);

        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();

        System.out.println("입력한 두 숫자는 " + iVal1 + "," + iVal2 + "입니다.");
        System.out.printf("두 숫자의 합은 %d", iVal1 + iVal2);
    }
}
