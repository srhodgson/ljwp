package Chapter07;

import java.util.Arrays;

public class Exercise03 {
    public static void main(String[] args) {
        int[] ages = { 25, 48, 27, 10, 4, 15 };

        System.out.println("The average age of the dinosaurs is " + avgAges(ages));

    }

    public static int avgAges(int[] ages) {
        int totalAge = 0;
        int avgAge = 0;

        for (int age : ages){
            totalAge += age;
        }

        avgAge = totalAge / ages.length;

        return avgAge;
    }
}
