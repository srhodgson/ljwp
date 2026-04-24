package Chapter07;

import java.util.Scanner;

public class Project {
    // Use Scanner for reading input from the user.
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Project project = new Project();
        project.start();

    }

    public void start() {
        // This is the main loop of the application. It will keep running until the user decides to exit
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            handleMenuChoice(choice);
        }
    }

    public void displayMenu() {
        System.out.println("Welcome to Mesozoic Eden Assistant!");
        System.out.println("1. Add a dinosaur");
        System.out.println("2. Check Park Hours");
        System.out.println("3. Greet Guest");
        System.out.println("4. Check Visitors Count");
        System.out.println("5. Manage Staff");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");
    }

    public void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                // addDinosaur();
                break;
            case 2:
                // checkParkHours();
                break;
            case 3:
                // greetGuest();
                break;
            case 4:
                // checkVisitorsCount();
                break;
            case 5:
                // manageStaff();
                break;
            case 6:
                System.out.println("Exiting...");
                System.exit(0);
        }
    }
}
