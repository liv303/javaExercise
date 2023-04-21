package com.example.javaExcercise.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User Siyun = new User();
        Siyun.name = "이시윤";
        Siyun.phoneNumber = "010-0000-0000";
        Siyun.age = 0;


        User Kyeongrok = new User();
        Kyeongrok.name = "김경록 강사님";
        Kyeongrok.phoneNumber = "010-1111-1111";
        Kyeongrok.age = 37;


        System.out.printf("%s님은 성인입니까? %s\n", Siyun.name, Siyun.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", Kyeongrok.name, Kyeongrok.isAdult());
    }
}
