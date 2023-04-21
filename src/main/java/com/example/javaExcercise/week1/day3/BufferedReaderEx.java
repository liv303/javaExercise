package com.example.javaExcercise.week1.day3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BufferedReaderEx {
    public void readALine() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is); //카트 가지고 오기

        String line = br.readLine();
        System.out.println("Line" + line);

        System.out.println("line1 = " + br.readLine());
        System.out.println("Line2 = " + br.readLine());
    }
}
