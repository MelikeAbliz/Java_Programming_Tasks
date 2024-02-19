package day29.employeeTask;

public class Developer extends Employee {
    private String programLanguage;

    public void setInfo(String name, String id, String jobTitle, char gender, int age, long salary, String programLanguage) {
        setInfo(name, id, jobTitle, gender, age, salary);
        setProgramLanguage(programLanguage);
    }

    public String getProgramLanguage() {
        return programLanguage;
    }

    public void setProgramLanguage(String programLanguage) {
//        {"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}
        if (programLanguage.equalsIgnoreCase("Java") ||
                programLanguage.equalsIgnoreCase("JavaScript") ||
                programLanguage.equalsIgnoreCase("Python") ||
                programLanguage.equalsIgnoreCase("Ruby") ||
                programLanguage.equalsIgnoreCase("C#") ||
                programLanguage.equalsIgnoreCase("C++") ||
                programLanguage.equalsIgnoreCase("Swift")
        ) {
            this.programLanguage = programLanguage;
        } else {
            System.err.println("Invalid programLanguage" + programLanguage);
            System.exit(1);
        }
    }

    public void coding() {
        System.out.println(getJobTitle() + " " + getName() + " is coding");
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", id='" + getId() + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", programLanguage=" + programLanguage +
                '}';
    }
}
/*
2. Create a custom Class named Developer

			Variables:
				name, gender, age, id, jobTitle, salary, programmingLanguage

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 to 65
					4. salary can not be negative
					5. programming language can only be set to one of the followings:
						{"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}

			Methods:
				setInfo(): sets all the fields (including programmingLanguage)
				coding()
				toString(): prints developer object info when the object is passed in the print statement
 */