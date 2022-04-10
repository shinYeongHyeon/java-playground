package chapter2.ch09;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentShin = new Student(1, "den");
        studentShin.setKoreaSubject("국어", 100);
        studentShin.setMathSubject("미적분", 95);

        Student studentKim = new Student(2, "kim");
        studentKim.setKoreaSubject("국어", 80);
        studentKim.setMathSubject("미적분", 100);

        studentShin.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
