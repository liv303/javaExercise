package week4.day1.Return;

public class Payment {
    public static void main(String[] args) {
        Account account = new Account();
        boolean isSufficient = account.isSufficient();;
        if(isSufficient){
            System.out.println("결제를 요청합니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}
