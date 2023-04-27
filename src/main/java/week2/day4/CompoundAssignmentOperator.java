package week2.day4;

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        int x = 10;
        System.out.printf("x : %d\n", x);

        x += 1;
        System.out.printf("x += 1 : %d\n", x);

        x -= 5;
        System.out.printf("x -= 5 : %d\n", x);

        x *= 2;
        System.out.printf("x *= 2 : %d\n", x);

        x /= 3;
        System.out.printf("x /= 3 : %d\n", x);

        x %= 8;
        System.out.printf("x %%= 8 : %d\n", x);
    }
}
