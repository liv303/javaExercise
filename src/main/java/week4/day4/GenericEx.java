package week4.day4;

import java.util.ArrayList;
import java.util.List;

/*  Generic : 컬렉션에 타입을 지정(명시)하는 기능   */
public class GenericEx {
    public static void main(String[] args) {
        // 문자형
        List<String> strList = new ArrayList<>();   // 리스트 타입
        strList.add("hello");
        strList.add("bye");
        strList.add("1");

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        for (String item : strList) {   // 이터레이터 : for문을 쓸 수 있음
            System.out.println(item);
        }

        for (var item : strList) {
            System.out.println(item);
        }
    }
}
