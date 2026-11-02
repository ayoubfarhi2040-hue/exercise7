import java.util.Scanner;

public class Person {
    protected String surname;
    protected String firstName;
    protected String street;
    protected String zipCode;
    protected String city;

    public void initialize(Scanner in) {
        System.out.print("Surname: ");    surname = in.nextLine();
        System.out.print("First name: "); firstName = in.nextLine();
        System.out.print("Street: ");     street = in.nextLine();
        System.out.print("Zip code: ");   zipCode = in.nextLine();
        System.out.print("City: ");       city = in.nextLine();
    }

    public void print() {
        System.out.println("Surname: " + surname);
        System.out.println("First name: " + firstName);
        System.out.println("Street: " + street);
        System.out.println("Zip code: " + zipCode);
        System.out.println("City: " + city);
    }
}
