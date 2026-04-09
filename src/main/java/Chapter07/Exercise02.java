package Chapter07;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = 0;

        try {
            System.out.print("Enter the dino's weight: ");
            weight = sc.nextInt();
        } finally {
            sc.close();
        }

        System.out.println("The dino weighs " + weight + "kg, so it needs " + dailyFood(weight) + "Kg of food a day");
    }

    public static int dailyFood(int weight) {
        int foodAmount = 0;

        foodAmount = weight * 5;

        return foodAmount;
    }
}
