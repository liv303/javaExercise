package week3.day2.While;

public class WhileCnt {
    public static void main(String[] args) {
        int cnt = 0;
        while(cnt < 11) {
            System.out.println(cnt++);    //증감 연산자는 바로 출력문에 사용 가능
        }
        System.out.println("cnt = " + cnt);
    }
}
