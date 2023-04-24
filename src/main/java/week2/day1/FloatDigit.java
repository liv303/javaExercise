package week2.day1;

public class FloatDigit {
    public static void main(String[] args) {


        float f5 = 1.23e5f;
        float f6 = 1.23e6f;
        float f7 = 1.23e7f;
        float f8 = 1.23e8f;
        float f9 = 1.23e9f;
        float f10 = 1.23e10f;   // float type은 f를 붙임. f붙이면 소수점 7자리까지 표현(소숫점 8자리에서 반올림).
        double d10 = 1.23e10;   // double type은 f를 붙이지 않음


        System.out.println("f5 = " + f5);   // 결과: 123000.0
        System.out.println("f6 = " + f6);   // 결과: 1230000.0
        System.out.println("f7 = " + f7);   // 결과: 1.23E7
        System.out.println("f8 = " + f8);   // 결과: 1.23E8
        System.out.println("f9 = " + f9);   // 결과: 1.23E9
        System.out.println("f10 = " + f10); // 결과: 1.23000003E10
        System.out.println("d10 = " + d10); // 결과: 1.23E10


        float f1 = 3.141592653589703f;  // 뒤에 f를 붙이면, 7자리를 초과하면 [8자리에서] 반올림한다.
        System.out.println(f1); // 결과: 3.1415927까지만 출력됨
    }
}
