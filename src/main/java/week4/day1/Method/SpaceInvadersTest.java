package week4.day1.Method;

public class SpaceInvadersTest {
    public static void main(String[] args) {
        SpaceInvaders si = new SpaceInvaders();

        si.moveLeft();
        si.moveLeft();
        System.out.printf("%d\n", si.location);

        si.moveRight();
        si.moveRight();
        System.out.printf("%d\n", si.location);
    }
}
