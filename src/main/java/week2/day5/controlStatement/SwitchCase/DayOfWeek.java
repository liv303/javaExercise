package week2.day5.controlStatement.SwitchCase;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println("1~7까지 숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int dayOfWeek = sc.nextInt();  //1: 월, 2: 화, ...


        switch (dayOfWeek) {    // 코드가 세로로 길어서 가독성이 떨어짐. 한 줄로 작성 가능
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            case 7:
                System.out.println("일요일");
                break;
            default:
                System.out.println("해당하는 요일이 없습니다.");
                // default문에는 모든 조건이 해당되지 않아 바로 종료되므로 break를 사용하지 않음
        }


    }
}
