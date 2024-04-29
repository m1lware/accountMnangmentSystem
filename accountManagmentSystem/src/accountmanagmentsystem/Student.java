
package accountmanagmentsystem;

import java.util.ArrayList;

public class Student extends Person{
    
    
    private String  status;
    private String  major;
    public Student(String firstName, String surName, String userName, String password, String status, String major) {
        super(firstName, surName, userName, password);
        this.status = status;
        this.major = major;
    }


    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

   
    
}
