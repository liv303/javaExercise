package week2.day3.referenceTypevariable;

/*
p.142 오브젝트, 객체와 클래스,
 */
public class Student {
    String name;
    String phoneNumber;
    int age;
    public static void main(String[] args) {
        Student student = new Student();    // Studemt type(참조 타입). new를 써서 Student 객체를 인스턴스로.
        Student[] students = new Student[30];

        Object obj = new Student();
        //Object obj2 = new PrintHello();

        // 클래스 > Reference type(primitive type은 클래스가 아님)

        students[0] = new Student();
        students[0].name = "이시윤";
        students[0].phoneNumber = "010-1111-1111";
        students[0].age = 0;

        students[1] = new Student();
        students[1].name = "김지유";
        students[1].phoneNumber = "010-2222-2222";
        students[1].age = 1;
    }
}
