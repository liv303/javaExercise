package week3.day2.While;

import java.time.LocalDateTime;

public class WhileCnt {
    public static void main(String[] args) throws InterruptedException {
        while (true) {  // 조건식이 true일 때 반복
            System.out.println(LocalDateTime.now());
            Thread.sleep(1000);
        }
    }
}
