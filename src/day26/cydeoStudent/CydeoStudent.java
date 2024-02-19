package day26.cydeoStudent;

public class CydeoStudent {
    public String name;
    public int age;
    public char gender;
    public String id;
    public char grade;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public static String magicWord;
    public static String programLanguage;

    public CydeoStudent(String name, int age, char gender, String id, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
    static {
        schoolName="Cydeo School";
        magicWord="Wooden Spoon";
        programLanguage="Java";
    }
    public void study(){
        System.out.println(name+" is studying ");
    }
    public void attendClass(){
        System.out.println(name+" is attended class ");
    }
    public static void printSchoolName(){
        System.out.println("school name is "+schoolName);
    }
    public static void printProgramLanguage(){
        System.out.println("program language is "+programLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", schoolName=" + schoolName +
                ", programLanguage=" + programLanguage +
                ", magicWord=" + magicWord +
                '}';
    }
}
/*
1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of the programming language
					toString()
 */