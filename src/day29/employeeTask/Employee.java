package day29.employeeTask;

public class Employee {
    private String name,id,jobTitle;
    private char gender;
    private int age;
    private long salary;

    public void setInfo(String name, String id, String jobTitle, char gender, int age, long salary) {
        setName(name);
        setId(id);
        setJobTitle(jobTitle);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
//        gender can only be 'M' or 'F'
        if (gender=='M'||gender=='F'){
            this.gender = gender;
        }else {
            System.err.println("Invalid gender"+gender);
            System.exit(1);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        2. age can not be negative
//        age MUST be between 18 to 65
        if (age<0){
            System.err.println("Age can not be negative"+age);
            System.exit(1);
        }
        if (age<18 || age>65){
            System.err.println("Invalid age"+age);
            System.exit(1);
        }
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        if (salary<0){
            System.err.println("Invalid salary"+salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
