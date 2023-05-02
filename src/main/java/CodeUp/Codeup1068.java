package CodeUp;

import java.util.Scanner;

public class Codeup1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        //JAVA는 비교 연산자를 연속 사용할 수 없음. 따라서 if(100>=score>=90)와 같은 형태로는 작성할 수 없음
        if ( 100 >= score && score >= 90 ) {
            System.out.println("A");
        } else if ( 90 > score && score >= 70 ) {
            System.out.println("B");
        } else if ( 70 > score && score >= 40 ) {
            System.out.println("C");
        } else if ( 40 > score && score >= 0 ) {
            System.out.println("D");
        } else {
            System.out.println("0~100점 사이의 점수를 입력하세요.");
        }
    }
}
