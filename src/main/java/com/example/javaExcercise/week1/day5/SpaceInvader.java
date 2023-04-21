package com.example.javaExcercise.week1.day5;

/* 지역변수 설명(클래스 내 메소드 내에 위치) */
public class SpaceInvader {
    private void moveLeft() {
        int location = 0;
        location = location - 1;
        System.out.printf("moveLeft: %d\n", location);
    }

    private void moveRight() {
        int location = 0;
        location = location + 1;
        System.out.printf("moveRight: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvader si = new SpaceInvader();
        si.moveLeft();  //키보드 왼쪽 키 누르면 실행되는 메소드
        si.moveRight(); //키보드 오른 키 누르면 실행되는 메소드
        si.moveRight(); //키보드 오른 키 누르면 실행되는 메소드
        si.moveRight(); //키보드 오른 키 누르면 실행되는 메소드 //지역 변수이기 때문에 값을 더하지 못했음
    }
}

