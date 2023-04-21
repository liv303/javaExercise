package com.example.javaExcercise.week1.day5;

public class ConstantEx {
    public final int MAX_LEVEL = 3; //상수 명명: 대문자_언더바 형식. Class 안에 바로 선언한 건 지역변수 아님. (멤버변수는 뭐지?)
    public static final int MIN_LEVEL = 3; //Static까지 붙이면 전역에서 사용 가능. Static 없으면 인스턴스 화 등 선행 작업 필요.

    public static void main(String[] args) {
        final int iVal;
        iVal = 1;
        System.out.println(iVal);

        //상수 타입 선언 final은 원시타입(int)뿐만 아니라 참조타입(PrintHello)에도 쓸 수 있음
        //final PrintHello printHello = new PrintHello();  //스프링부트에서 객체를 DI로 받을 때 바뀌면 안돼서..

    }
}
