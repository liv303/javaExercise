package week2.day4.LogicalOperator;

public class BoilerControl {
    public static void main(String[] args) {
        int waterTemperature = 45;  // 물의 온도
        int roomTemperature = 22;   // 실내 온도

        boolean check = waterTemperature < 50 && roomTemperature < 24;
        System.out.printf("check : %b\n", check);   // %b 불리언 타입
    }
}
