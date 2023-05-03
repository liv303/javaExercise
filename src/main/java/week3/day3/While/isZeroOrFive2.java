package week3.day3.While;
//static method 안 쓴 코드
public class isZeroOrFive2 {
    public static void main(String[] args) {
        int num = 555;

        String flagText = "0 또는 5로만 이루어진 숫자입니다.";
        while (num > 0) {
            int remainder = num % 10;
            if (remainder % 5 != 0) { // If문에 걸리면
                flagText = "0 또는 5로만 이루어진 숫자가 아닙니다.";
                break;
            }
            num /= 10;
        }
        System.out.println(flagText);
    }
}
