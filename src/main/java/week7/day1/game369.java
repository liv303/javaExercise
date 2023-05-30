package week7.day1;

public class game369 {
    public static void main(String[] args) {
        for (int cnt = 0; cnt < 100; cnt++) {
            System.out.printf(cnt + "");
            int num1 = cnt / 10;
            int num2 = cnt % 10;
            if (num1 % 3 == 0 && num1 != 0) System.out.print("*");
            if (num2 % 3 == 0 && num2 != 0) System.out.print("*");
            System.out.println();
        }
    }
}
