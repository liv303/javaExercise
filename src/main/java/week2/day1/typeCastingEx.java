package week2.day1;

public class typeCastingEx {
    // 암시적 형 변환, 자동 형 변환(Widening Casting)
    public static void main(String[] args) {
        /*
        int result1 = 1 + "1";  //java Err: incompatible types: java.lang.String cannot be converted to int

        System.out.println(result1);

        int result2 = "1" + 1;
        System.out.println(result2);    //java Err: incompatible types: java.lang.String cannot be converted to int


        int iResult = "1" + 1;  //java Err: incompatible types: java.lang.String cannot be converted to int
        String sResult = 1 + "1";
        System.out.println(iResult + sResult);
         */

        int iResult = 1+ Integer.parseInt("1");
        System.out.println(iResult);

        /*
        Java 기준에서 String이 int보다 우선 입력되도록 되어 있기 때문에
        int에 1+"1" 값을 넣으려고 하면 에러, String에 넣으려 하면 String으로 자동으로 변환(concat: 문자열끼리 이음)
         */




        // 강제 형 변환(Narrowing Casting)
        String val1 = "1.5";
        String val2 = "2.5";

        /*
        int result = Integer.parseInt(val1) + Integer.parseInt(val2);
        System.out.println("result = "+ result);    // 결과는 'Erro: For input string: "1.5"'. 소수점이 있으므로 Float type이기 때문이다.
        */

        float result = Float.parseFloat(val1) + Float.parseFloat(val2); // Float.parseFloat(): 괄호 안의 문자열을 Float형으로 구조화
        System.out.println(result);



    }
}
