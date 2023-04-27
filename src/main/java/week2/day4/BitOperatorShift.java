package week2.day4;

public class BitOperatorShift {
    public static void main(String[] args) {

        int val1 = 1;
        System.out.println(val1 << 1);  // * 2^1
        System.out.println(Integer.toBinaryString(val1 << 1));  // 10
        System.out.println(val1 << 2);  // * 2^2
        System.out.println(Integer.toBinaryString(val1 << 2));  // 100

        int val2 = 32;
        System.out.println(val2 >> 1);  // 1 / 2^1
        System.out.println(Integer.toBinaryString(val2 >> 1));  //10000
        System.out.println(val2 >> 2);  //  1 / 2^2
        System.out.println(Integer.toBinaryString(val2 >> 2));  //1000
    }
}
