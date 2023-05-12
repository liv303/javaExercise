package week4.day1;

public class PyramidStars2 {
    public static void main(String[] args) {
        int height = 4;
        for (int i = 0; i < height; i++) {
            // 3 2 1 0
            for (int j = 0; j < height - i - 1; j++) {
                System.out.printf(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {   // 별의 갯수는 홀수개로 증가
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
