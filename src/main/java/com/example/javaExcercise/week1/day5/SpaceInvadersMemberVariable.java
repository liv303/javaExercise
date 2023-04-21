package com.example.javaExcercise.week1.day5;

/* 멤버 변수 설명 */
public class SpaceInvadersMemberVariable {
    int location;   //멤버 변수(클래스 안, 메소드 밖에 선언)

    public void moveLeft(){ //SOLID 원칙 중 Single Responsibility(단일 책임의 원칙)
        location = location - 1;
    }

    public void moveRight(){ //SOLID 원칙 중 Single Responsibility(단일 책임의 원칙)
        location = location + 1;
    }

    public void moveLeftAndPrint(){
        location = location - 1;
        System.out.printf("moveLeft 후 현재 위치: %d\n", location);
    }
    public void moveRightAndPrint(){
        location = location + 1;
        System.out.printf("moveRight 후 현재 위치: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        simv.moveLeft();
        simv.moveLeftAndPrint();
        simv.moveRight();
        simv.moveRight();
        simv.moveRightAndPrint();
        System.out.printf("최종 위치: %d", simv.location);
    }
}
