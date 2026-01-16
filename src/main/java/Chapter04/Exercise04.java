package Chapter04;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parkRating;

        try {
            System.out.println("Please enter the park's current safety rating -->");
            parkRating = sc.nextInt();
        } finally {
            sc.close();
        }

        if (parkRating < 10) {
            System.out.println("Warning the park's safety rating has dropped below 10!");
        } else {
            System.out.println("The park's safety rating is currently within the acceptable range");
        }
    }
}
