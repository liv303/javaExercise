package CodeUp;
/* 입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자.
    단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.    */
import java.util.Scanner;

public class Codeup1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int bigVal = val1 > val2 ? val1 : val2;
        System.out.println(bigVal);
    }
}

/*  참고
3개의 요소로 이루어지는 3항(ternary) 연산자는
"조건식 ? (참일 때의 값) : (거짓일 때의 값)” 의 형태로 사용하는 연산자이다.
- 조건식의 계산 결과가 참인 경우에는 ':' 왼쪽의 값 또는 식으로 바뀌고,
- 거짓인 경우에는 ':' 오른쪽의 값 또는 식으로 바뀐다.
 */