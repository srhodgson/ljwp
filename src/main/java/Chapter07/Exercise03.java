package Chapter07;

import java.util.Arrays;

public class Exercise03 {
    public static void main(String[] args) {
        int[] dinoAges = { 24, 14, 17, 60, 3, 34, 19, 32 };
        

        System.out.println("The average age of the dinosaurs is: " + calcAvgAge(dinoAges));
    }

    public static int calcAvgAge(int[] ages) {
        int avgAge = 0;
        int totAge = 0;

        for (int age : ages) {
            totAge += age;
        }

        avgAge = totAge / ages.length;

        return avgAge;
    }
}

