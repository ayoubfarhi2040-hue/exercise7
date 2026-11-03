import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Staff staff = new Staff();          // default constructor
        staff.initialize1(in);
        System.out.println("\n--- Staff data ---");
        staff.print1();
    }
}
