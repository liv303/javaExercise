package CodeUp;


import java.util.Scanner;

public class Codeup1019 {
    /*
    년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
        입력: 연, 월, 일이 ".(닷)"으로 구분되어 입력된다. 2013.8.5
        출력: 입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다. 2013.08.05
    */
    public static void main(String[] args) {
        //System.out.println(". 으로 구분하여 연, 월, 일을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String val = sc.next();

        String[] strArr = val.split("\\."); //"."이 아닌 "\\.": 정규식에서 .이 1byte의 데이터를 가리키기 때문
        int year = Integer.parseInt(strArr[0]);
        int month = Integer.parseInt(strArr[1]);
        int day = Integer.parseInt(strArr[2]);

        System.out.printf("%04d.%02d.%02d", year, month, day);  // StringFormmating해서 출력
    }
}
