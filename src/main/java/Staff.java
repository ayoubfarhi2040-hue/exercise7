import java.util.Scanner;

public class Staff extends Person {
    private String education;
    private String position;

    public void initialize1(Scanner in) {
        super.initialize(in);               // Person's fields
        System.out.print("Education: "); education = in.nextLine();
        System.out.print("Position: ");  position = in.nextLine();
    }

    public void print1() {
        super.print();                      // Person's fields
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}
