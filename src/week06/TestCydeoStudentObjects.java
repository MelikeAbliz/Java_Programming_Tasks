package week06;

public class TestCydeoStudentObjects {
    public static void main(String[] args) {
        CydeoStudent student1=new CydeoStudent();
        student1.name="melike";
        student1.age=18;
        student1.gender='F';
        student1.batch="JD 007";

        CydeoStudent student2=new CydeoStudent();
        student2.setInfo("Art",20,'M',"SDET batch 10");
        CydeoStudent student3=new CydeoStudent();
        student3.setInfo("Fitim",22,'M',"CS batch 5");


        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }
}
