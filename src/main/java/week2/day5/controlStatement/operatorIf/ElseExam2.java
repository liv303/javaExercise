package week2.day5.controlStatement.operatorIf;

public class ElseExam2 {
    public static void main(String[] args) {
        int account = 1400;


        if (account >= 1500) {
            System.out.println("1500원을 차감합니다.");
        } else {
            System.out.println("\"잔액이 부족합니다.\"를 재생합니다.");
        }
    }
}
