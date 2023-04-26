package week2.day3.remainder;

public class RemainderQuote {
    public static void main(String[] args) {
        int iVal = 1;

        System.out.println(iVal / 2);   // java에서 1을 2로 나누면 0(몫)
        System.out.println(iVal % 2);


        int a = 10;
        int b = 3;

        int quote = 10 / 3;
        int remainder = 10 % 3;

        System.out.printf("10을 3으로 나눈 몫은 %d이고 나머지는 %d이다.", quote, remainder);
    }
}
