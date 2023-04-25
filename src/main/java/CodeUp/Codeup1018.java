package CodeUp;
import java.util.Scanner;

public class Codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String[] strArr = str.split(":");

        int hour = Integer.parseInt(strArr[0]);
        int minute = Integer.parseInt(strArr[1]);

        System.out.printf("%02d:%02d", hour, minute);
    }
}
