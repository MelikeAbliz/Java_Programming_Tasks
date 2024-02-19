package day27.cydeoStudent;

public class CydeoStudent {
    public String name, fieldOfStudy;
    public char gender;
    public int age, batchNumber, groupNumber;
    public static String schoolName, programmingLanguage, secretCode;

    public CydeoStudent(String name, String fieldOfStudy, char gender, int age, int batchNumber, int groupNumber) {
        this.name = name;
        this.fieldOfStudy = fieldOfStudy;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    static {
        schoolName = "Cydeo School";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName() {
        System.out.println("school name: " + schoolName);
    }

    public static void printSecretCode() {
        System.out.println("Secret Code: " + secretCode);
    }

    public void attendClass() {
        System.out.println(name + " attending class");
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/*
2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields.

            Add a static block to initialize all the statics.

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()


 */