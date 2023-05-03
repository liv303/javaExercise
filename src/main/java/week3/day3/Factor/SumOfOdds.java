package week3.day3.Factor;
/*  1~10까지의 수 중에서 2의 약수 구하기(2로 나누어지는 수) 구하기     */

public class SumOfOdds {
    public static void main(String[] args) {
        int answer = 0;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
