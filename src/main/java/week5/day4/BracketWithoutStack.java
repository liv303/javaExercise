package week5.day4;
/*
괄호 짝이 올바른지 판단하기(1):
 Stack 구현하지 않고 .replace() 사용
 */
public class BracketWithoutStack {
    public static void main(String[] args) {
        String brackets = "((()(()))))";

        while(brackets.indexOf("()") != -1) {
            brackets = brackets.replace("()", "");
        }

        if (brackets.length() == 0) {
            System.out.println("올바른 괄호 입니다");
        } else {
            System.out.println("올바른 괄호가 아닙니다");
        }
    }
}
