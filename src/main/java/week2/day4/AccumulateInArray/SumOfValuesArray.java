package week2.day4.AccumulateInArray;

public class SumOfValuesArray {
    public static void main(String[] args) {
        int answer = 0;
        int[] arr = {2, 1, 7, 4};

        answer = answer + arr[0];
        answer = answer + arr[1];
        answer = answer + arr[2];
        answer = answer + arr[3];

        System.out.printf("arrLength : %d\n", arr.length);
        System.out.printf("answer = %d", answer);

    }
}