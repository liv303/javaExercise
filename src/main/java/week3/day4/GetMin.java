package week3.day4;

public class GetMin {
    public static void main(String[] args) {
        int[] arr = {2, 1, 31, 9, 7};

        // 최대값 구하기
        int targetValue = arr[0];    // 가장 작은 값 저장할 변수 targetValue. arr[0]이 아닌 0을 넣으면 음수인 경우 문제 발생

        for (int i = 0; i < arr.length; i++) {
            // targetValue < arr[i] 일 때 교체
            if (targetValue > arr[i]) targetValue = arr[i];
        }

        System.out.println(targetValue);
    }
}
