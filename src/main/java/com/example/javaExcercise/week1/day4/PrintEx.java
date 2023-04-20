package com.example.javaExcercise.week1.day4;

public class PrintEx {
    public void print() {
        System.out.printf("%s", "Hello\n");
        System.out.println("bye");
    }

    public static void main(String[] args) {
        PrintEx printfEx = new PrintEx(); // PrintEx나와라
        printfEx.print(); // printEx야 물대포를 쏴줘
    }
}
