package week3.day2.While;

public class WhileCnt2 {
    public static void main(String[] args) {
        int cnt = 0;

        while (cnt < 11) {  // false가 되면 while문을 빠져 나감
            System.out.printf("%d ", cnt);
            cnt++;
        }

        // while문을 빠져 나온 후 실행하는 코드 영역
    }
}
