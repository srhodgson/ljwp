package Chapter04;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = 0;

        try {
            System.out.println("Please enter the dino's weight -->");
            weight = sc.nextInt();
        } finally {
            sc.close();
        }

        if (weight <= 120) {
            System.out.println("The dino needs 4 feeds per day");
        } else if (weight > 120 && weight <= 140) {
            System.out.print("The dino needs 6 feeds per day");
        } else {
            System.out.println("The dino needs 8 feeds per day");
        }
    }
}
