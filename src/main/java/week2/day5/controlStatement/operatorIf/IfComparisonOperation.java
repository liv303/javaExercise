package week2.day5.controlStatement.operatorIf;

public class IfComparisonOperation {
    public static void main(String[] args) {
        int age = 20;
        boolean isAdult = age >= 18;

        if (isAdult) {  // isAdult 값이 true일 때 실행
            System.out.println("성인입니다.");
        }
        if (age < 18) { // 조건의 결과가 false이므로 실행하지 않음
            System.out.println("미성년자입니다.");
        }
    }
}
