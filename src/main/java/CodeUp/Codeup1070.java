package CodeUp;

import java.util.Scanner;

/*  월이 입력될 때 계절 이름 출력하기 */
public class Codeup1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch ( month )    {
            case 12, 1, 2:
                System.out.println("winter");
                break;
            case 3, 4, 5:
                System.out.println("spring");
                break;
            case 6, 7, 8:
                System.out.println("summer");
                break;
            case 9, 10, 11:
                System.out.println("fall"); break;
            default: System.out.println("잘못된 입력입니다.");
        }
    }
}
