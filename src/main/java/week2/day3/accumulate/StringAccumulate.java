package week2.day3.accumulate;

public class StringAccumulate {
    public static void main(String[] args) {
        String answer = ""; // 빈 칸을 넣고 초기화

        answer += "쿵";
        System.out.println(answer);

        answer += "짝";
        System.out.println(answer);

        /* [참고]
        char[] str = new char[5];   // 내부에서는 배열을 쓰고.. 배열이 불변이라서 불변 객체..
        char[] str2 = new char[6];
         */
    }
}
