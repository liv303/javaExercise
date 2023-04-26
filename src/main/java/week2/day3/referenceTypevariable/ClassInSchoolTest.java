package week2.day3.referenceTypevariable;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.classNumber = 1;

        classInSchool.teacher = new Teacher();
        System.out.println(classInSchool.hashCode());   // ClassInSchool에 직접 넣은 코드는 아니지만 Object 클래스 밑에 기본 포함된 클래스여서 가능

        classInSchool.teacher.name = "김경록";
        classInSchool.teacher.age = 33;
        classInSchool.teacher.address = "경기도 광주시 양벌동";

        classInSchool.students = new Student[30];

        System.out.println(classInSchool.teacher.name);
        System.out.printf("%d반 담임 선생님 성함은 %s입니다.", classInSchool.classNumber, classInSchool.teacher.name);
    }
}
