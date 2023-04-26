package week2.day3.accumulate;

public class bankAccount {
    public static void main(String[] args) {
        int myAccount = 0;

        myAccount = myAccount + 1_000_000;  //세 자리마다 쉽표 아닌 언더 바 사용함
        System.out.println(myAccount);

        myAccount = myAccount - 500_000;
        System.out.println(myAccount);

        myAccount = myAccount + 4_000_000;
        System.out.println(myAccount);

    }
}
