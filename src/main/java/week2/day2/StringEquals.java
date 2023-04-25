package week2.day2;

public class StringEquals {
    public static void main(String[] args) {    // String은 char 배열로 만들어져 있음
        System.out.println("GOLD" == "GOLD");   // 메모리 주소끼리 비교하므로 true로 나옴

        String str1 = "GOLD";
        String str2 = "G";

        // tr1과 2가 같은가?
        boolean isSame = str1.substring(0, 1) == str2;
        System.out.println(isSame);

        //System.identityHashCode()   // 주소 값 보여줌
        System.out.println("GOLD : " + str1.hashCode());
        System.out.println("G --> " + str2.hashCode());
        /*
        String은 Reference Type(Heap 영역 주소를 참조하는 타입)
         */
    }
}
