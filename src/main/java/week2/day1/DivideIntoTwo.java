package week2.day1;

public class DivideIntoTwo {
    public static void main(String[] args) {
      // 1 + 1 / 2

        float fOne = 1;
        float fTwo = 2;
        System.out.printf("%f\n", fOne + fOne / fTwo);  // 결과: 1.500000(%f는 소수점 6자리까지 표현)


        int iOne = 1;
        int iTwo = 2;
        System.out.printf("%d", iOne + iOne / iTwo);    // 결과: 1 (int는 소수점을 버림. 반올림 X)


        System.out.printf("%d\n", 9 / 2);   // 결과: 4
        System.out.printf("%f\n", 9 / 2.0);  // 결과: 4.5

    }
}
