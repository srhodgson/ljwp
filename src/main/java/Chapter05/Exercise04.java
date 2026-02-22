package Chapter05;

public class Exercise04 {
    static void main(String[] args) {
        int[] weights = {230, 500, 175, 197, 407, 679 };
        int totalWeight = 0;

        for (int i = 0; i <= 5; i++) {
            totalWeight = totalWeight + weights[i];
            i++;
        }

        System.out.println("The total weight of the dinos is: " + totalWeight);
    }
}
