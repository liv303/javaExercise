package week3.day2.ForLoop;

public class ForLoopCase {
    public static void main(String[] args) {
        for (int i = 0; 1 == 1; i++) {  // '1 == 1' 은 항상 true입니다. '1 == 1' 대신 'true'를 쓸 수 있고 종료 조건을 비워서 쓸 수도 있음(현업에서는 true를 많이 씀)
            System.out.println(i);
        }
    }
}
