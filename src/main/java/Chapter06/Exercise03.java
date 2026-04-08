package Chapter06;



public class Exercise03 {

        static void main(String[] args) {
        int[] weights = {10000, 20000, 30000, 40000, 50000};
        int maxWeight = weights[0];

        for (int i = 1; i < weights.length; i++) {
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
            }
        }

        System.out.println("The heaviest dinosaur weighs: " + maxWeight + "Kg.");
    }
}
