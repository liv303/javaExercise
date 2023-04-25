package CodeUp;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jumin = sc.nextLine();
        String val1 = jumin.substring(0, 6);    // 0, 1, 2, 3, 4, 5
        String val2 = jumin.substring(7);   // 7부터 끝까지
        //int val3 = Integer.parseInt(jumin.substring(0, 6));

        System.out.println(val1 + val2);
        //System.out.printf("%d", val3);    // int형은 유효하지 않은 0은 인식하지 않음
        /*
        int형 쓰는 경우: String으로 입력 받고, Integer로 Parsing, Integer->String
        int형이 String보다 메모리를 적게 쓰지만, 위의 과정을 거치면 메모리를 더 쓰기도 함
        따라서 연산을 하지 않는 경우는 String으로 적는게 정확할 수 있음
         */
    }
}
