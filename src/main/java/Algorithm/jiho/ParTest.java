package Algorithm.jiho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
괄호 짝이 맞는지 확인하기(Stack 구현)
()()((()))
((()(())()))((())(()()
 */
public class ParTest {
    public boolean solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();   // 괄호 입력 받는 부분

        Stack<Character> charStack = new Stack<>(); // 스택 만들기

        for (int i = 0; i < input.length(); i++) {
            char next = input.charAt(i);

            // 1. 여는 괄호를 만날 때 push
            if (next == '(') {
                charStack.push(next);
            }
            // 2. 닫는 괄호를 만날 때
            else if (next == ')') {
                // pop할 게 없으면 검사 실패(false 반환)
                if (charStack.empty()) return false;
                // 아니라면 pop
                char top = charStack.pop();
                // pop 결과 값이 여는 괄호인지 확인. 여는 괄호 아니면 실패
                if (top != '(') return false;
            }
        }

        // 3. 순회 끝나면 스택이 비었는지 확인
        return charStack.empty();
    }

    public static void main(String[] args) throws IOException {
        System.out.println((new ParTest()).solution());
    }
}
