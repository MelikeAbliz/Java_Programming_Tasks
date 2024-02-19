package day27.cydeoStudent;

public class TestCydeoStudent {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Medine", "Java developer", 'M', 25, 30, 17);
        CydeoStudent student2 = new CydeoStudent("Hanife", "SDET", 'M', 19, 22, 15);
        System.out.println(student1);
        System.out.println(student2);
        student1.attendClass();
        student2.attendClass();
        student1.study();
        student2.study();
        CydeoStudent.printSchoolName();
        CydeoStudent.printSecretCode();

    }
}
