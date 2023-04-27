package week2.day4.ComparisonOperator;

public class ComparisonOperatorsEx {
    public static void main(String[] args) {
        int iVal1 = 10;
        int iVal2 = 20;

        boolean result = iVal1 == iVal2;
        System.out.printf("iVal1와 iVal2가 같은가: %b", result);

        result = iVal1 != iVal2;
        System.out.printf("iVal1와 iVal2가 다른가: %b", result);

        result = iVal1 >= iVal2;
        System.out.printf("iVal1이 iVal2보다 크거나 같은가: %b", result);
    }
}
