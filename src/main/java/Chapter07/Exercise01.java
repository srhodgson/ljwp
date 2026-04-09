package Chapter07;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;

        try {
            System.out.print("Enter the dino's age: ");
            age = sc.nextInt();
        } finally {
            sc.close();
        }

        System.out.println("The dino is " + age + " years old, this means it is " + stageOfLife(age));
    }

    /**
     *
     * @param age
     * @return returns the stage of a dinosaur's life based on the age provided
     */
    public static String stageOfLife(int age) {
        String stageOfLife = "";

        if (age > 0 && age <= 10) {
            stageOfLife = "Hatchling";
        } else if (age > 10 && age <= 19) {
            stageOfLife = "Juvenile";
        } else if (age > 19) {
            stageOfLife = "Adult";
        }

        return stageOfLife;
    }
}
