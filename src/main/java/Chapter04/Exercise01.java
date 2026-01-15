package Chapter04;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // import java.util.Scanner
        System.out.println("Does the dino eat meat (1 for yes, 0 for no)? --> ");
        int meatEater = sc.nextInt();

        boolean eatsMeat = false;

        if (meatEater == 1)
            eatsMeat = true;

        if (eatsMeat) {
            System.out.println("This dino is a carnivore!");;
        } else {
            System.out.println("This dino is a herbivore!");
        }
    }
}
