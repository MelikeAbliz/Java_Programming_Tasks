package week10;

import java.util.ArrayList;

public class Company {

    private String companyName, location;

    private ArrayList<Employee> employees = new ArrayList<>(); // READ ONLY

    public Company(String companyName) {
        setCompanyName(companyName);
        setLocation("None");
    }

    public Company(String companyName, String location) {
        setCompanyName(companyName);
        setLocation(location);
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getLocation() {
        if(location == null){
            return "None";
        }
        return location;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }


    public void hireEmployee(Employee employee){

        if(employee == null){
            throw new RuntimeException("Can not add null key to the employees list");
        //    System.err.println("Can not add null key to the employees list");
         //   System.exit(1);
        }

        employees.add(employee);
    }

    public void hireEmployee(Employee[] employees){

        // this.employees.addAll(Arrays.asList(employees));
        for (Employee employee : employees) {
            hireEmployee(employee);
        }

    }


    public void fireEmployee(String employeeId){

        if(employeeId == null){
            throw new RuntimeException("The employeeId can not be null");
        }

        employees.removeIf( p -> p.getEmployeeId().equalsIgnoreCase(employeeId));

    }

    public void fireEmployee(String[] employeeIds){

        for (String employeeId : employeeIds) {
            fireEmployee(employeeId);
        }

    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                ", total number of employees=" + employees.size() +
                '}';
    }


    public void displayEmployeesInfo(){
        for (Employee employee : employees) {
            System.out.println("---------------------");
            employee.displayInfo();
        }
    }


}

/*
5. Create a class named Company with the following specifications:
     Attributes:
       - companyName (String)
       - location (String)
       - employees (ArrayList)

     Encapsulate the fields, but only generate getter for the employees ArrayList.
     Add a constructor that can set the companyName and location when the company object is created.

     Actions:
       - hireEmployee(Employee): takes an employee object and adds it to the employees list

       - fireEmployee(id): removes the employee with the given id from the employees list

       - toString(): returns the String representation of the company object which includes the companyName, location and total number of the employees.

       - displayEmployeesInfo(): displays the information of the employees in the company
 */