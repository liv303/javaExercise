package com.example.javaExcercise.week1.day3;

import java.util.Scanner;

public class ScannerStrEx {
    public void inputStringAndPlus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("연결할 두 어휘를 입력하세요(enter로 구분): ");
        System.out.println(sc.next() + sc.next());
    }
}
