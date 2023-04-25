package CodeUp;

import java.util.Scanner;

public class Codeup1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//공백으로 구분한 2개의 정수 입력 받기
        String value = sc.nextLine();

        String[] valArr = value.split(" ");
        long longVal1 = Integer.parseInt(valArr[0]);
        long longVal2 = Integer.parseInt(valArr[1]);
        long result = longVal1 + longVal2;

        System.out.println(result);
    }
}
