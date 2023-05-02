package week3.day2.While;

import java.time.LocalDateTime;

public class WhileSleep {
    public static void main(String[] args) throws InterruptedException {
        while (true) {  // 조건식이 true일 때 반복
            System.out.println(LocalDateTime.now());    // LocalDateTime.now(): 현재 시간 구하기
            Thread.sleep(1000); // 1 초 마다 출력. Thread.sleep(): () 값 만큼 대기하는 메소드
        }
    }
}
