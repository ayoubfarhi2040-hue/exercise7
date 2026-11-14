import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Staff staff = new Staff();
        staff.initialize1(in);
        System.out.println("\n--- Staff data ---");
        staff.print1();

        System.out.println("\n--- Salary ---");
        System.out.println("Salary to pay (160h x 30): " + staff.salaryToPayFarhi77491(160, 30));
        System.out.println("Overtime (10h x 30): " + staff.salaryForOvertimeFarhi77491(10, 30));
        System.out.println("Bonus: " + Salary.shouldReceiveBonusFarhi77491(staff.getYearsOfExperienceFarhi77491()));
    }
}