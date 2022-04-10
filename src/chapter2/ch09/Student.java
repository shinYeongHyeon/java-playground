package chapter2.ch09;

public class Student {
    int studentId;
    String studentName;

    Subject korea;
    Subject math;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        this.korea = new Subject();
        this.math = new Subject();
    }

    public void setKoreaSubject(String name, int score) {
        this.korea.subjectName = name;
        this.korea.score = score;
    }

    public void setMathSubject(String name, int score) {
        this.math.subjectName = name;
        this.math.score = score;
    }

    public void showScoreInfo() {
        int total = this.korea.score + this.math.score;
        System.out.println(this.studentName + " 학생의 총점은 " + total + "점 입니다.");
    }
}
