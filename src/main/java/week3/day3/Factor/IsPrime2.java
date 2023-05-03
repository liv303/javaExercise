package week3.day3.Factor;
/*  약수를 출력하고, 소수인지 판별하기 */
public class IsPrime2 {
    public static void main(String[] args) {
        // 2 부터 n-1 까지만 check
        // i * i < 50
        // break; num % i == 0 이면

        int num = 2_473_037;  // 991은 소수라서 991까지 반복
        boolean isPrime = true;

        for (int i = 2; i * i <= num; i++) {
            System.out.printf("%d ", i);
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println("\n" + num + " is Prime? " + isPrime);
    }
}
