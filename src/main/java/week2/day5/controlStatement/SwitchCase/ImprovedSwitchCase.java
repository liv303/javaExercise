package week2.day5.controlStatement.SwitchCase;

/*  Java 14버전부터 정식 도입된 '개선된 switch-case문입니다.  */

public class ImprovedSwitchCase {
    public static void main(String[] args) {
        System.out.println("개선된 switch-case문은 ':'대신 '->'를 사용하며, break를 생략합니다.");


        int month = 11;


        switch (month) {
            case 12, 1, 2 -> System.out.println("겨울");
            case 3, 4, 5 -> System.out.println("봄");
            case 6, 7, 8 -> System.out.println("여름");
            case 9, 10, 11 -> System.out.println("가을");
            default -> System.out.println("잘못된 입력값입니다.");
        }
    }
}
