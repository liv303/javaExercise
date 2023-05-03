package week3.day3;

public class BreakEx2 {
    public static void main(String[] args) {
        // i^2 < 50인 i
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if(i * i > 50) break;
        }
    }
}
