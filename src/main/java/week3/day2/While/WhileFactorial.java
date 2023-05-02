package week3.day2.While;

public class WhileFactorial {
    public static void main(String[] args) {
        int num = 5;
        int answer = 1; // 곱셈의 결과를 저장할 변수이므로 1로 초기화

        while (num > 0) {
            answer *= num--;
            System.out.println(answer);
        }

    }
}
/*
 결과:
  5     // answer = answer * 5 의 결과
  20    // answer *= 4 의 결과
  60    // answer *= 3 의 결과
  120   // answer *= 2 의 결과
  120   // answer *= 1 의 결과
 */