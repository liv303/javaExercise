package week4.day4;

import week4.day1.Method.User;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        // 생성자 public User() {} 로 추가한 경우 User1 추가하기
        User user1 = new User();
        user1.setName("데빌링");
        user1.setPhoneNumber("010-2222-2222");
        user1.setAge(14);
        users.add(user1);


        User user2 = new User("멍멍이", "010-3333-3333", 13);
        users.add(user2);


        for (User user : users) {
            System.out.printf("%s님의 전화번호는 %s입니다.\n", user.getName(), user.getPhoneNumber());
        }
    }
}
