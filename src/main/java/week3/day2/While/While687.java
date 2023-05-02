package week3.day2.While;


/*  ★ While문으로 자릿수의 합 구하기    */
public class While687 {

    public static void main(String[] args) {
        int n = 687;
        int answer = 0;

        while (n > 0){
            answer += n % 10;   // 나머지를 먼저 구해야함!!
            n = n / 10; // 몫을 먼저 구하면 나머지를 날림
        }


        System.out.println("각 자릿수 숫자의 합" + answer);
    }
}
