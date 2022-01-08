package chapter2.ch04;

// 다른 패키지의 경우 import 필요
import chapter2.ch02.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentId = 20101540;
        student.address = "경기도";
        student.setStudentName("신영현");

        student.showStudentInfo();
    }
}
