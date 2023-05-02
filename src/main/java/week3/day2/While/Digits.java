package week3.day2.While;
/*  While문으로 자릿수 구하기    */
public class Digits {
    public static void main(String[] args) {
        int num = 45634;


        // 자릿수 만큼 반복하기
        int digits = 0; // 반복 횟수를 0으로 초기화


        while (num > 0) {   // 5회 실행
            num /= 10;  // 일의 자릿수를 버림
            digits++;
            System.out.println(digits + "회 반복 후 남은 값: " + num);
        }


        System.out.println("총 반복 횟수: " + digits); // 5
    }
}
