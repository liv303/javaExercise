package week3.day2.ForLoop;

public class ForLoopCase2Root {
    public static void main(String[] args) {
        //math.sqrt()
        for (int i = 0; i < Math.sqrt(50) ; i++) {  // .sqrt()연산의 cost 높음
            //for 종료 조건에 i*i <= 50;을 쓸 수 있음
            System.out.println(i);
        }
    }
}
