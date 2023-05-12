package week4.day1.Method;

public class UserTest {
    public static void main(String[] args) {    // STATIC에 올라가는 메소드 main
        User user1 = new User();    // 인스턴스 생성(HEAP에 올림)
        user1.setName("이시윤");   // User에서 Getter, Setter를 만들었기 때문에 .name 안 됨
        user1.setPhoneNumber("010-0000-0000");
        user1.setAge(18);


        System.out.printf("%s님은 어른입니까? %b\n", user1.name, user1.isAdult());


        /*  User에 Getter, Setter 안만든 경우

        User user2 = new User();
        user2.name = "포포링";
        user2.phoneNumber = "010-1111-1111";
        user2.age = 17;

        System.out.printf("%s님은 어른입니까? %b\n", user2.name, user2.isAdult());
        */
    }
}
