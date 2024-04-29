package accountmanagmentsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import my_util.Scrumbler;
import my_util.SpecialCharChecker;

public class Operation {
Scrumbler crypto = new Scrumbler();
String encryptedPass;

    Scanner in = new Scanner(System.in);
    ArrayList<Student> std = new ArrayList<>();
    ArrayList<FacultyEmployee> fEmp = new ArrayList<>();
    ArrayList<SupportAndServicesEmployee> sEmp = new ArrayList<>();
    ArrayList<SignInData> sData = new ArrayList<>();

    public void SignUp(int a) throws IOException {
        if (a == 1) {
            boolean flag = false;
            System.out.print("Enter the first name: ");
            String firstName = in.next();
            System.out.print("Enter the surname name: ");
            String surName = in.next();
            System.out.print("Enter the username: ");
            String userName = in.next();
            System.out.print("Enter password: ");
            String password = in.next();
            System.out.print("Enter major: ");
            String major = in.next();
            System.out.print("Enter status: ");
            String status = in.next();

            for (int i = 0; i < std.size(); i++) {
                if (std.get(i).getUserName().equals(userName)) {
                    flag = true;
                    System.out.println("ERROR: User with the same username already exists! Please choose another username");
                }
            }

            if (flag == false) {
                Student s = new Student(firstName, surName, userName, password, status, major);
                SignInData sD = new SignInData(userName, password);
                std.add(s);
                sData.add(sD);
                File f1 = new File("std.txt");
                boolean isExists = f1.exists();
                if (isExists == false) {
                    f1.createNewFile();
                }
                FileWriter fr = new FileWriter(f1);
                PrintWriter pr = new PrintWriter(fr);
                
                for (int i = 0; i < std.size(); i++) {
                    encryptedPass = crypto.encrypt(std.get(i).getPassword());
                    pr.println("First name: " + std.get(i).getFirstName() + "\n"
                            + "Sur name: " + std.get(i).getSurName() + "\n"
                            + "User name: " + std.get(i).getUserName() + "\n"
                            + "Password: " + encryptedPass + "\n"
                            + "Status: " + std.get(i).getStatus() + "\n"
                            + "Major: " + std.get(i).getMajor() + "\n");
                }
                pr.close();
                fr.close();
            }
        } else if (a == 2) {
            boolean flag = false;
            System.out.print("Enter the first name: ");
            String firstName = in.next();
            System.out.print("Enter the surname name: ");
            String surName = in.next();
            System.out.print("Enter the username: ");
            String userName = in.next();
            System.out.print("Enter password: ");
            String password = in.next();
            System.out.print("Enter department: ");
            String major = in.next();
            System.out.print("Enter office number: ");
            String status = in.next();
            System.out.print("Enter rank: ");
            String rank = in.next();
            System.out.print("Enter specialisation: ");
            String specialisation = in.next();

            for (int i = 0; i < fEmp.size(); i++) {
                if (fEmp.get(i).getUserName().equals(userName)) {
                    flag = true;
                    System.out.println("ERROR: User with the same username already exists! Please choose another username");
                }
            }

            if (flag == false) {
                FacultyEmployee f = new FacultyEmployee(firstName, surName, userName, password, rank, specialisation, rank, a);
                SignInData sD = new SignInData(userName, password);
                fEmp.add(f);
                sData.add(sD);
                File f1 = new File("fEmp.txt");
                boolean isExists = f1.exists();
                if (isExists == false) {
                    f1.createNewFile();
                }
                FileWriter fr = new FileWriter(f1);
                PrintWriter pr = new PrintWriter(fr);

                for (int i = 0; i < fEmp.size(); i++) {
                    encryptedPass = crypto.encrypt(fEmp.get(i).getPassword());
                    pr.println("First name: " + fEmp.get(i).getFirstName() + "\n"
                            + "Sur name: " + fEmp.get(i).getSurName() + "\n"
                            + "User name: " + fEmp.get(i).getUserName() + "\n"
                            + "Password: " + encryptedPass + "\n"
                            + "Rank: " + fEmp.get(i).getRank() + "\n"
                            + "Specialisation: " + fEmp.get(i).getSpecialisation() + "\n"
                            + "Department: " + fEmp.get(i).getDepartment() + "\n"
                            + "Office number: " + fEmp.get(i).getOfficeNumber() + "\n");
                }
                pr.close();
                fr.close();
            }
        } else if (a == 3) {
            boolean flag = false;
            System.out.print("Enter the first name: ");
            String firstName = in.next();
            System.out.print("Enter the surname name: ");
            String surName = in.next();
            System.out.print("Enter the username: ");
            String userName = in.next();
            System.out.print("Enter password: ");
            String password = in.next();
            System.out.print("Enter department: ");
            String major = in.next();
            System.out.print("Enter office number: ");
            String status = in.next();
            System.out.print("Enter job: ");
            String jobDescription = in.next();

            for (int i = 0; i < sEmp.size(); i++) {
                if (sEmp.get(i).getUserName().equals(userName)) {
                    flag = true;
                    System.out.println("ERROR: User with the same username already exists! Please choose another username");
                }
            }

            if (flag == false) {
                SupportAndServicesEmployee sE = new SupportAndServicesEmployee(firstName, surName, userName, password, status, a, jobDescription);
                SignInData sD = new SignInData(userName, password);
                sEmp.add(sE);
                sData.add(sD);
                File f1 = new File("sEmp.txt");
                boolean isExists = f1.exists();
                if (isExists == false) {
                    f1.createNewFile();
                }
                FileWriter fr = new FileWriter(f1);
                PrintWriter pr = new PrintWriter(fr);

                for (int i = 0; i < sEmp.size(); i++) {
                    encryptedPass = crypto.encrypt(sEmp.get(i).getPassword());
                    pr.println("First name: " + sEmp.get(i).getFirstName() + "\n"
                            + "Sur name: " + sEmp.get(i).getSurName() + "\n"
                            + "User name: " + sEmp.get(i).getUserName() + "\n"
                            + "Password: " + encryptedPass + "\n"
                            + "Department: " + sEmp.get(i).getDepartment() + "\n"
                            + "Office number: " + sEmp.get(i).getOfficeNumber() + "\n"
                            + "Job description: " + sEmp.get(i).getJobDescription() + "\n");
                }
                pr.close();
                fr.close();
            }
        }
    }

    public void SignIn(int a) {
        
        boolean flag = false;
        System.out.print("Enter the username: ");
        String userName = in.next();
        System.out.print("Enter password: ");
        String password = in.next();
        
        int x = 0;
        for (int i = 0; i < sData.size(); i++) {
            if (sData.get(i).getUserName().equals(userName) && sData.get(i).getPassword().equals(password)) {
                flag = true;
                System.out.println("Login success...");
                x = i;
                break;
            }
            if (flag == false) {
                System.out.println("Incorrect username or password! Please try again");
                SignIn(a);
            }
        }
        if (a == 1) {
            System.out.print("1. Show my information.\n"
                    + "2. Change my name.\n"
                    + "3. Change my password.\n"
                    + "4. Exit.\n"
                    + "Enter your choice: ");
            int t = in.nextInt();
            if (t == 1) {
                encryptedPass = crypto.encrypt(std.get(x).getPassword());
                System.out.println("First name: " + std.get(x).getFirstName() + "\n"
                        + "Sur name: " + std.get(x).getSurName() + "\n"
                        + "User name: " + std.get(x).getUserName() + "\n"
                        + "Password: " + encryptedPass + "\n"
                        + "Status: " + std.get(x).getStatus() + "\n"
                        + "Major: " + std.get(x).getMajor() + "\n");
            } else if (t == 2) {
                System.out.println("Enter new name");
                String name = in.next();
                std.get(x).setFirstName(name);
                System.out.println("Change done...");
            } else if (t == 3) {
                System.out.println("Enter new password");
                String pass1 = in.next();
                System.out.println("Re Enter new password");
                String pass2 = in.next();
                if (pass1.equals(pass2)) {
                    std.get(x).setPassword(pass1);
                    System.out.println("Change done...");
                } else {
                    System.out.println("password dosen't matched");
                }
            } else if (t == 4) {
                return;
            }
        }
        if (a == 2) {
            System.out.print("1. Show my information.\n"
                    + "2. Change my name.\n"
                    + "3. Change my password.\n"
                    + "4. Exit.\n"
                    + "Enter your choice: ");
            int t = in.nextInt();
            if (t == 1) {
                encryptedPass = crypto.encrypt(fEmp.get(x).getPassword());
                System.out.println("First name: " + fEmp.get(x).getFirstName() + "\n"
                        + "Sur name: " + fEmp.get(x).getSurName() + "\n"
                        + "User name: " + fEmp.get(x).getUserName() + "\n"
                        + "Password: " + encryptedPass + "\n"
                        + "Rank: " + fEmp.get(x).getRank() + "\n"
                        + "Specialisation: " + fEmp.get(x).getSpecialisation() + "\n"
                        + "Department: " + fEmp.get(x).getDepartment() + "\n"
                        + "Office number: " + fEmp.get(x).getOfficeNumber() + "\n");
            } else if (t == 2) {
                System.out.println("Enter new name");
                String name = in.next();
                fEmp.get(x).setFirstName(name);
                System.out.println("Change done...");
            } else if (t == 3) {
                System.out.println("Enter new password");
                String pass1 = in.next();
                System.out.println("Re Enter new password");
                String pass2 = in.next();
                if (pass1.equals(pass2)) {
                    fEmp.get(x).setPassword(pass1);
                    System.out.println("Change done...");
                } else {
                    System.out.println("password dosen't matched");
                }
            } else if (t == 4) {
                return;
            }
        }
        if (a == 3) {
            System.out.print("1. Show my information.\n"
                    + "2. Change my name.\n"
                    + "3. Change my password.\n"
                    + "4. Exit.\n"
                    + "Enter your choice: ");
            int t = in.nextInt();
            if (t == 1) {
                encryptedPass = crypto.encrypt(sEmp.get(x).getPassword());
                System.out.println("First name: " + sEmp.get(x).getFirstName() + "\n"
                        + "Sur name: " + sEmp.get(x).getSurName() + "\n"
                        + "User name: " + sEmp.get(x).getUserName() + "\n"
                        + "Password: " +encryptedPass + "\n"
                        + "Department: " + sEmp.get(x).getDepartment() + "\n"
                        + "Office number: " + sEmp.get(x).getOfficeNumber() + "\n"
                        + "Job description: " + sEmp.get(x).getJobDescription() + "\n");
            } else if (t == 2) {
                System.out.println("Enter new name");
                String name = in.next();
                sEmp.get(x).setFirstName(name);
                System.out.println("Change done...");
            } else if (t == 3) {
                System.out.println("Enter new password");
                String pass1 = in.next();
                System.out.println("Re Enter new password");
                String pass2 = in.next();
                if (pass1.equals(pass2)) {
                    sEmp.get(x).setPassword(pass1);
                    System.out.println("Change done...");
                } else {
                    System.out.println("password dosen't matched");
                }
            } else if (t == 4) {
                return;
            }
        }

    }
}
