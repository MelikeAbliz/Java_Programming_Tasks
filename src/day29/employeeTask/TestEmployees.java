package day29.employeeTask;

public class TestEmployees {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setInfo("alex","A101","Java Developer",'M',28,100000,"Java");

        System.out.println(developer);
        Employee tester=new Tester();
        tester.setInfo("Ayse","B201","Java Tester",'F',25,98000);
        System.out.println(tester);
    }
}
