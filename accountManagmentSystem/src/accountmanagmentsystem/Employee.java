package accountmanagmentsystem;

public class Employee extends Person {

    private String department;
    private int officeNumber;

    public Employee(String department, int officeNumber, String firstName, String surName, String userName, String password) {
        super(firstName, surName, userName, password);
        this.department = department;
        this.officeNumber = officeNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

}
