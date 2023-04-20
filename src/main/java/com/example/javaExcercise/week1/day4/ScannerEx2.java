package com.example.javaExcercise.week1.day4;

import java.util.Scanner;

public class ScannerEx2 {
    public void inputTwoNumbersAndPlus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("두개의 숫자를 입력하세요. 입력하고 엔터 입력하고 엔터");
        System.out.print("첫번째 숫자:");
        System.out.println("첫번째 숫자는 " + sc.nextInt() + "입니다.");
        System.out.print("두번째 숫자:");
        System.out.println("두번째 숫자는 " + sc.nextInt() + "입니다.");
    }
}
