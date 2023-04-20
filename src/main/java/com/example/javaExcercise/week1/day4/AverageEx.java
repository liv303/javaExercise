package com.example.javaExcercise.week1.day4;

import java.util.Scanner;

public class AverageEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%.1f", (sc.nextFloat() + sc.nextFloat() + sc.nextFloat() / 3));
    }
}
