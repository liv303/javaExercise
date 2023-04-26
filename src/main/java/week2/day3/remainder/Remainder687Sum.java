package week2.day3.remainder;
/*  num의 각 자릿수의 숫자의 합 구하기    */
public class Remainder687Sum {
    static int num = 687;
    public static void printNum(){
        System.out.println("num : " + num);
    }
    public static void main(String[] args) {

        int firstRemainder = num % 10;  // num에 10을 나눈 나머지: 7
        num = num / 10; // num = 68
        printNum();

        int secondRemainder = num % 10;
        num = num / 10; // num = 6
        printNum();

        int thirdRemainder = num % 10;
        num = num / 10; // num = 0
        printNum();

        System.out.println("각 자릿수 숫자의 합: " + firstRemainder + secondRemainder + thirdRemainder);
    }
}
