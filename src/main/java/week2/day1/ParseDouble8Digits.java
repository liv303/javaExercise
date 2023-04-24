package week2.day1;

public class ParseDouble8Digits {
    public static void main(String[] args) {
        String val1 = "1.11111111";
        String val2 = "2.11111111811111677";


        // val1, val2를 float type으로 연산 결과: 3.2222223(소수점 6자리까지 표현)
        float result1 = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println(result1);


        // val1, val2를 double type으로 연산 결과: 3.22222222(소수점 15자리까지 표현)
        double result2 = Double.parseDouble(val1) + Double.parseDouble(val2);
        System.out.println(result2);


    }
}
