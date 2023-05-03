package week3.day3.While;

public class ZeroOrFive {
    public static boolean isZeroOrFive(int num) {
        //자릿수만큼 반복하기
        while (num > 0) {
            int remainder = num % 10;   // 가장 낮은 자릿수의 수를 구함
            if (remainder % 5 == 0) {
                return false;
            }
            num /= 10;  // 가장 낮은 자릿수를 버림
        }
        return true;
    }


    public static void main(String[] args) {
        int num = 2530;  // 25 3 0 순서로 변함
        int cnt = 0;

        System.out.printf("%d는 5와 0으로만 구성되었나요? %b\n", num, isZeroOrFive(num));
    }
}