import java.util.Scanner;

public class Staff extends Person implements Salary {
    private String education;
    private String position;
    private int yearsOfExperienceFarhi77491;

    public void initialize1(Scanner in) {
        super.initialize(in);
        System.out.print("Education: "); education = in.nextLine();
        System.out.print("Position: ");  position = in.nextLine();
        System.out.print("Years of experience: ");
        yearsOfExperienceFarhi77491 = Integer.parseInt(in.nextLine().trim());
    }

    public void print1() {
        super.print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
        System.out.println("Years of experience: " + yearsOfExperienceFarhi77491);
    }

    public int getYearsOfExperienceFarhi77491() {
        return yearsOfExperienceFarhi77491;
    }

    @Override
    public double salaryToPayFarhi77491(double hoursFarhi77491, double rateFarhi77491) {
        return hoursFarhi77491 * rateFarhi77491;
    }

    @Override
    public double salaryForOvertimeFarhi77491(double overtimeHoursFarhi77491, double rateFarhi77491) {
        return overtimeHoursFarhi77491 * rateFarhi77491 * 2.0;
    }
}