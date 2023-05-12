package week4.day4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List l1 = new ArrayList();  // 리스트 선언 후 구현체는 ArrayList로 지정
        l1.add("Hello");    // .add() : 리스트에 값을 넣음
        l1.add(1);
        System.out.println(l1.get(0));   // .get() 리스트에서 인덱스를 이용해 값을 뽑음
        System.out.println(l1.get(1));
        System.out.println(l1.size());  // .size() : 들어있는 값의 갯수
        System.out.println(l1.isEmpty());   // .isEmpth()
        l1.remove(0);   // 0번 인덱스 지정 후 요소 삭제
        l1.remove(0);
        System.out.println(l1.isEmpty());

        int[] arr = new int[3];
        arr[0] = 1;
        arr[0] = 0;
    }
}
