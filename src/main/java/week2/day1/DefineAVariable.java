package week2.day1;

public class DefineAVariable {
    public static void main(String[] args) {
        int nu = 10;
        String name = "이시윤";    //primitive type 쓰듯이 초기화
        String name2 = new String("테디"); //윗 줄의 코드의 원래 형태

        String sOne = new String("1");
        int iOne = 1;
        float fOne = 1.0f;


        System.out.printf("String:%s Number:%d Float:%f\n", sOne, iOne, fOne);
        System.out.println(iOne == fOne);


    }
}
