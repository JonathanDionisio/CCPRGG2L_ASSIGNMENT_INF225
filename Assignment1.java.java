import java.util.Scanner;

public class Validation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter NU Student email address: ");
        String email = sc.nextLine();

        if (email.matches("elizerponiojr@students.national-u.edu.ph") && email.endsWith("@students.national-u.edu.ph")) {
            System.out.println("Corret NU Student email address! :)");
        } else {
            System.out.println("Inccorrect NU Student email address! :(");
        }

        System.out.println("input your phone number: ");
        String phonumb = sc.nextLine();

        if (phonumb.matches("+639123456789")) {
            System.out.println("Correct phone number! :O");
        } else {
            System.out.println("Incorrect phone number! :<");
        }
    }
}