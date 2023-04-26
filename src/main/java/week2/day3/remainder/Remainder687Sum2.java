package week2.day3.remainder;
/*  각 자리수 합을 누적하기   */
public class Remainder687Sum2 {
    public static void main(String[] args) {
        int num = 687;

        int answer = 0; // 누적할 변수 선언
        answer = answer + num % 10;  // 나머지 구해 누적하기
        System.out.printf("answer: %d\n", answer);

        num = num / 10; // 누적할 변수 선언
        answer = answer + num % 10;  // 나머지 구해 누적하기
        System.out.printf("answer: %d\n", answer);

        num = num / 10;
        answer = answer + num % 10;  // 나머지 구해 누적하기
        System.out.printf("answer:%d\n", answer);
    }
}
