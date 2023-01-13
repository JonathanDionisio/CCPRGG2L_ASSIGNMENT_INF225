import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drivingTest("Passed the driving test");
        scan.close();
    }

    static void drivingTest(String drive) {

        System.out.println("Taking the training");
        train(drive);

        String feedback = instructorfeedback(drive);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            retaking(drive);

            // Recursive call
            drivingTest(drive);
        } else if (feedback.equals("yes")) {
            Passing(drive);
        }
    }

    static void train(String drive) {
        System.out.println("Training");
    }

    static String instructorfeedback(String drive) {
        System.out.println("Did you passed the " + drive + "? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void retaking(String drive) {
        System.out.print("Want to retake the exam?");
        String ingredient = scan.next();
        System.out.println("Fixing recipe. Added " + ingredient);
    }

    static void Passing(String drive) {
        System.out.println("Congratulations you" + drive);
    }

}