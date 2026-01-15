package Chapter04;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearsExperience = 0;

        try {
            System.out.println("Enter how long you've worked here iin years --> ");
            yearsExperience = sc.nextInt();
        } finally {
            sc.close();
        }

        if (yearsExperience <= 0) {
            System.out.println("You don't have enough experience to work with the dinos yet");
        } else if (yearsExperience > 0 && yearsExperience < 6) {
            System.out.println("You can work with the small dinosaurs");
        } else if (yearsExperience > 5 && yearsExperience < 11) {
            System.out.println("You can work with the medium sized dinosaurs");
        } else if (yearsExperience > 10 && yearsExperience < 16) {
            System.out.println("You can work with the large dinosaurs");
        } else {
            System.out.println("You can work with the T Rex!");
        }
    }
}
