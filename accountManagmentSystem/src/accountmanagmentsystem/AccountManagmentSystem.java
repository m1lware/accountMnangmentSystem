package accountmanagmentsystem;

import java.io.IOException;
import java.util.Scanner;

public class AccountManagmentSystem {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Operation o = new Operation();
        System.out.print("Menu:\n"
                + "1. Sign up.\n"
                + "2. Sign in.\n"
                + "3. Exit.\n"
                + "Enter your choice: ");
        int x = in.nextInt();
        while (x != 3) {
            if (x == 1) {
                System.out.print("1. Student.\n"
                        + "2. Faculty.\n"
                        + "3. Support and Services.\n"
                        + "Enter the account type: ");
                int a = in.nextInt();
                o.SignUp(a);
            } else if (x == 2) {
                System.out.print("1. Student.\n"
                        + "2. Faculty.\n"
                        + "3. Support and Services.\n"
                        + "Enter the account type: ");
                int a = in.nextInt();
                 o.SignIn(a);
            } else {
                System.out.println("Incorrect input! Please try again:");
            }
            System.out.print("Menu:\n"
                    + "1. Sign up.\n"
                    + "2. Sign in.\n"
                    + "3. Exit.\n"
                    + "Enter your choice: ");
            x = in.nextInt();
        }
    }

}
