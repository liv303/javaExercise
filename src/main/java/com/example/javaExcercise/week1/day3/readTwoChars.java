package com.example.javaExcercise.week1.day3;

import java.io.IOException;
import java.io.InputStreamReader;

public class readTwoChars {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);


        int asciiCode1 = is.read();
        int asciiCode2 = is.read();


        System.out.println(asciiCode1);
        System.out.println(asciiCode2);
    }
}
