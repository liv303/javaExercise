package week2.day5.controlStatement.SwitchCase;
/*
case 12:
case 1:
case 2:
    sout("겨울");
    break;
case 3:
    ...
위의 코드를 여러 개의 조건을 묶어서 아래와 같이 사용할 수 있음
 */
public class SeasonSwitch {
    public static void main(String[] args) {
        int month = 3;
        switch (month) {
            case 12, 1, 2: System.out.println("겨울"); break;
            case 3, 4, 5: System.out.println("봄"); break;
            case 6, 7, 8: System.out.println("여름"); break;
            case 9, 10, 11: System.out.println("가을"); break;
            default: System.out.println("해당하는 계절이 없습니다.");
        }

    }
}
