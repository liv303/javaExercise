package week2.day4.AccumulateInArray;

public class Accumulate687While {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        while(num > 0){
            answer= answer + (num % 10);
            num = num / 10;
            System.out.println("num : " + num + "  " + "answer : " + answer);
        }
    }
}
