package week2.day1;

public class BooleanEx {
    public static void main(String[] args) {
        int age = 16;


        boolean flag1 = 1 != 2;
        boolean flag2 = 1 == 3;
        boolean isPaymentSuccess = true;
        boolean isBalanceSufficient = false;
        boolean isChild = age < 14;


        System.out.println("1 != 2: " + flag1);
        System.out.println("1 == 3: " + flag2);
        System.out.println("isPaymentSuccess: " + isPaymentSuccess);
        System.out.println("isPaymentSuccess: " + isBalanceSufficient);
        System.out.println("isChild: " + isChild);
    }
}
