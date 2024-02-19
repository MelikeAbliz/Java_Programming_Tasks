package week10;

public class Manager extends Employee{

    private String department;

    public Manager(String name, int age, String gender, String employeeId, double salary, String department) {
        super(name, age, gender, employeeId, salary);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + getDepartment());
    }

    @Override
    public void work() {
        System.out.println("Manager "+getName()+" is managing "+getDepartment());
    }

}

/*
4. Create another subclass of Employee named Manager with the following specifications:
     Attributes:
       - department (String)

     Encapsulate the fields.
     Add a constructor that can set all the fields when the Manager object is created.
     Override the work and displayInfo methods.
 */