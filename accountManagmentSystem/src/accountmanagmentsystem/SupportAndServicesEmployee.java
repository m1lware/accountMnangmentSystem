package accountmanagmentsystem;

public class SupportAndServicesEmployee extends Employee{
    private String jobDescription;

    public SupportAndServicesEmployee(String firstName, String surName, String userName, String password, String department, int officeNumber, String jobDescription) {
        super(department, officeNumber, firstName, surName, userName, password);
        this.jobDescription = jobDescription;
    }

    
    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}
