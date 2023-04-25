package week2.day2;

import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {


        /*  배열 생성 방법 1  */
        int[] iArr1 = new int[3];    // 배열의 갯수 반드시 지정해야함. 배열의 길이는 불가변
        System.out.println(iArr1);   //결과: [I@27d6c5e0 (I는 int 타입 배열. @는 구분자. 뒤는 해시 주소)
        iArr1[0] = 2;
        iArr1[1] = 4;

        // 배열의 요소 추출하기
        System.out.println(iArr1[0]);
        System.out.println(iArr1[1]);
        System.out.println(iArr1[2]);    // 넣은 값이 없는데 0이 나오는 이유: new 할 때 기본 값 0이 들어감

        System.out.println(Arrays.toString(iArr1));


        /*  배열 생성 방법 2  */
        int[] iArr2 = new int[]{1, 2, 3, 8}; // 4개 값을 넣었으므로 배열의 크기 4로 인식
        System.out.println(Arrays.toString(iArr2));
    }
}
