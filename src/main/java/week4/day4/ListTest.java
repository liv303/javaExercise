package week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List l2 = new ArrayList();
        System.out.println(l2); // []

        l2.add("1");
        System.out.println(l2); // [1]

        l2.add(2);
        System.out.println(l2); //[1, 2]

        System.out.println(l2.get(1));  // 2

        l2.add("3");    // 3

        System.out.println(l2.size());  //[2, 3] 2

        l2.remove(0);
        System.out.println(l2 + " " + l2.size());   // [3]

        l2.add(4);
        System.out.println(l2); // [2, 3, 4]

        l2.remove(1);
        System.out.println(l2.isEmpty());   // false

        l2.add("5");
        System.out.println();
    }
}
