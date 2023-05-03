package CodeUp;
/*  doWhile문을 이용해서 0이 입력될 때까지 무한 출력하기   */

import java.util.Scanner;

public class Codeup1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            input = sc.nextInt();   // 입력 받기
            if(input !=0) System.out.println(input);
        } while (input != 0);   // 조건식이 참일 때 do 반복
    }
}
