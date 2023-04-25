package CodeUp;
import java.util.Scanner;

/*  16진수를 입력받아 10진수로 변환하고, 이를 8진수로 변환하여 출력하기  */
public class Codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 클래스로 입력 받기
        String hexa = sc.nextLine();    // 16진수를 문자열로 입력 받기

        int decimal = Integer.parseInt(hexa, 16);   // 입력 받은 16진수(문자열) --> 10진수(정수). 16은 변환하려는 문자열이 16진수임을 나타내는 매개변수

        String octal = Integer.toOctalString(decimal);  // 10진수(정수) --> 8진수(문자열)

        System.out.println(octal);

        //System.out.println(hexa);
        //System.out.println(decimal);
    }
}
