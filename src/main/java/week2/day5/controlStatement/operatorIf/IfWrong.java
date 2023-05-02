package week2.day5.controlStatement.operatorIf;

public class IfWrong {
    public static void main(String[] args) {
        int score = 81;

        // 1, 2, 3번 if문을 모두 실행합니다.
        if (score >= 90) {
            System.out.println("첫 번째 if 조건에 부합합니다.");
        }


        if (score >= 80) {
            System.out.println("두 번째 if 조건에도 부합합니다.");
        }


        if (score >= 70) {
            System.out.println("세 번째 if 조건에도 부합합니다.");
        }
    }
}
