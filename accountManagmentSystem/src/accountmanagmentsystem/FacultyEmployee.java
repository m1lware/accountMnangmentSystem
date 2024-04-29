package accountmanagmentsystem;

public class FacultyEmployee extends Employee {

    private String rank;
    private String specialisation;

    public FacultyEmployee(String firstName, String surName, String userName, String password, String rank, String specialisation, String department, int officeNumber) {
        super(department, officeNumber, firstName, surName, userName, password);
        this.rank = rank;
        this.specialisation = specialisation;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

}
