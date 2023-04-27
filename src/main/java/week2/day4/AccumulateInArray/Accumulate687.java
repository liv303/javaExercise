package week2.day4.AccumulateInArray;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer= 0;

        //나머지를 먼저 구한 후
        answer = answer + (num % 10);
        //몫을 구해야 합니다.
        num = num / 10;
        //68 --> 10으로 나눈 나머지 8
        System.out.printf("num : %d, answer : %d\n", num, answer);

        answer += (num % 10);
        num /= 10;
        System.out.printf("num : %d, answer : %d\n", num, answer);

        answer += (num % 10);
        num /= 10;
        System.out.printf("num : %d, answer : %d\n", num, answer);
    }
}
