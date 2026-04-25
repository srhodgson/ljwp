package Chapter07;

import java.time.LocalTime;
import java.util.Scanner;

public class Project {
    // Use Scanner for reading input from the user.
    Scanner scanner = new Scanner(System.in);

    // Initialise arrays to store dino information 
    String[] dinoNames = new String[10];
    int[] dinoAges = new int[10];
    int[] dinoWeights = new int[10];
    String[] staffNames = new String[10];
    int[] staffAges = new int[10];
    int[] staffLevels = new int[10];
    int staffCount = 0;
    int dinoCount = 0;

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
                addDinosaur();
                break;
            case 2:
                checkParkHours();
                break;
            case 3:
                greetGuest();
                break;
            case 4:
                checkVisitorsCount();
                break;
            case 5:
                manageStaff();
                break;
            case 6:
                System.out.println("Exiting...");
                System.exit(0);
        }
    }


    public void addDinosaur() {
        if (dinoCount >= 10) {
            System.out.println("The park is at full capacity, we can't add any more dinosaurs.");
            return;
        }

        scanner.nextLine(); // CLear the input 
        System.out.println("Enter the dinosaur's name:");
        dinoNames[dinoCount] = scanner.nextLine();
        System.out.println("Enter the dinosaurs age: ");
        dinoAges[dinoCount] = scanner.nextInt();
        System.out.println("Enter the dinosaur's weight: ");
        dinoWeights[dinoCount] = scanner.nextInt();
        dinoCount++;

        System.out.println(dinoNames[dinoCount - 1] + " has been added to the park!");
        System.out.println();
    }
    
    public void checkParkHours() {
        LocalTime currentTime = LocalTime.now();
        LocalTime openTime = LocalTime.parse("09:00");
        LocalTime closeTime = LocalTime.parse("17:00");

        if (currentTime.isAfter(openTime) && currentTime.isBefore(closeTime)) {
            System.out.println("The park is currently open.");
        } else {
            System.out.println("The park is currently closed.");
        }
    }

    public void greetGuest() {
        String guestName = "";

        scanner.nextLine();
        System.out.println("Enter the guests name: ");
        guestName = scanner.nextLine();

        System.out.println("Hi " + guestName + " welcome to Mesozoic Eden! The park closes at 17:00");
    }

    public void checkVisitorsCount() {
        int currentVisitors = 147;
        int maxVisitors = 300;
        int nextGroup = 0;

        scanner.nextLine();
        System.out.println("Please enther the size of the next group of guests: ");
        nextGroup = scanner.nextInt();

        if (nextGroup <= maxVisitors - currentVisitors) {
            System.out.println("There is enough space, this group can enter!");
            currentVisitors = currentVisitors + nextGroup;
            return;
        } else {
            System.out.println("There currently isn't enough space for this group, they will need to wait");
            return;
        }
    }

    public void manageStaff() {
        if (staffCount >= 10) {
            System.out.println("The park is at full capacity, we can't add any more staff.");
            return;
        }

        scanner.nextLine(); // CLear the input 
        System.out.println("Enter the staff member's name:");
        staffNames[staffCount] = scanner.nextLine();
        System.out.println("Enter the staff member's age: ");
        staffAges[staffCount] = scanner.nextInt();
        System.out.println("Enter the staff member's level: ");
        staffLevels[staffCount] = scanner.nextInt();
        staffCount++;

        System.out.println(staffNames[staffCount - 1] + " has joined the park staff!");
        System.out.println();
    }
}
