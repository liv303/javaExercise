package CodeUp;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("\\.");  //"\\." 대신 "[.]"도 가능

        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
