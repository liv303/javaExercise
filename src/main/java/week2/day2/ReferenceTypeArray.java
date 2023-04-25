package week2.day2;

import java.util.Arrays;
import java.util.List;

public class ReferenceTypeArray {
    public static void main(String[] args) {


        /*  참조 타입 배열 선언에 따른 기본 할당 값  */
        float[] fArr = new float[3];
        String[] sArr = new String[3];

        System.out.println(fArr[0]);    // 결과: 0.0(배열 생성할 때 값을 넣지 않으면 0.0으로 초기화)
        System.out.println(sArr[0]);    // 결과: null(배열 생성할 때 값을 넣지 않으면 null)
        System.out.println(Arrays.toString(fArr));  // 결과: [0.0, 0.0, 0.0]
        System.out.println(Arrays.toString(sArr));  // 결과: [null, null, null]
        // sArr[0].split(" "); //null pointer Exception 발생


        /*  배열의 초기화 값과 비교하기 위해 List 기본 할당 값을 출력  */
        List[] listArr = new List[3];
        System.out.println(listArr[0]); // 결과: null
    }
}
