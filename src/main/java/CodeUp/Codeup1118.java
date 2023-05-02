package CodeUp;

import java.util.Scanner;
/*  삼각형 넓이 구하기 */
public class Codeup1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baseLine = sc.nextInt();
        int height = sc.nextInt();

        float triArea = ((float) baseLine * (float) height) / 2;

        System.out.printf("%.1f", triArea);
    }
}
