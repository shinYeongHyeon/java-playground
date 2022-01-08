package chapter2.ch02;

class Other {}
/*
 하나의 파일에 클래스가 여러 개 올수는 있으나,
 퍼블릭은 하나여야함
 */

public class Student {
    public int studentId;
    public String studentName;
    public String address;

    public void showStudentInfo() {
        System.out.println(studentId + " 학번의 이름은" + studentName + "이고, 주소는 " + address + "입니다");
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}
