package week2.day5.controlStatement.operatorIf;

public class IfWithLogicalOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;


        if ( x > 0 && y > 0 ) {
            System.out.println("x와 y는 모두 양수입니다.");
        }


        if ( x > 0 || y > 0 ) {
            System.out.println("x와 y중 적어도 하나는 양수입니다.");
        }


        if ( !(x > 0) ) {
            System.out.println("x는 음수 또는 0입니다.");
        }
    }
}
