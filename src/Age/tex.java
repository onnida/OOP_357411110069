package Age;

import java.util.Scanner;

public class tex {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String id = getID();
        String Name = getName();
        String Salary = getSalary();
        String Overtime = getOvertime();
    }

    private static String getOvertime() {
        System.out.print("Enter employee Overtime :");
        return scanner.nextLine();
    }

    private static String getSalary() {
        System.out.print("Enter employee Salary : ");
        return scanner.nextLine();
    }

    private static String getName() {
        System.out.print("Enter employee Name : ");
        return scanner.nextLine();
    }

    private static String getID() {
        System.out.print("Enter employee id : ");
        return scanner.nextLine();
    }


}
