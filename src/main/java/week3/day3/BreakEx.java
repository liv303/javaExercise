package week3.day3;


public class BreakEx {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            break;  // break를 만나면 문 밖으로 나감
            //out.println(i);  // 앞에서 break를 만났기 때문에 출력문이 실행되지 않음
        }
    }
}
