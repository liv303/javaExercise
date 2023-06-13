package Algorithm.jiho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 소괄호, 중괄호, 대괄호로 이루어진 문자열을 검사하는 코드를 작성하시오

public class ParTest2 {
    public boolean solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();   // 괄호 입력 받는 부분

        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i <= input.length() - 1; i++) {
            char next = input.charAt(i);

            // 1. 모든 여는 괄호를 만나면 push
            if (next == '(' || next == '{' || next == '[') {
                charStack.push(next);
            }
            // 2. 어떠한 닫는 괄호든 만나면
            else if (next == ')' || next == '}' || next == ']') {
                // a. pop할 게 없으면 검사 실패(false 반환)
                // --> 스택이 비어 있다.
                if (charStack.empty()) return false;
                // b. 아니라면 pop
                char top = charStack.pop();

                // c. pop의 결과로 나온 값이 올바른 여는 괄호인지 확인
                // '들어온 건 닫는 소괄호 && top은 여는 소괄호'가 아닐 때 실패
                if (next == '(' && top != '(') return false;
                else if (next == '}' && top != '{') return false;
                else if (next == ']' && top != '[') return false;
            }
        }
        // 3. 순회가 끝나면 스택이 비었는지 확인
        return charStack.empty();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new ParTest2().solution());
        // 테스트 케이스 1. ({{()(){}{}{}}})  --> true
        // 테스트 케이스 2. {{()(){}{}{}}})  --> flase
        // 테스트 케이스 3. ({{(a)(b){c}{d}{e}}f}g)  --> true
        // 테스트 케이스 4.   --> false
    }
}
