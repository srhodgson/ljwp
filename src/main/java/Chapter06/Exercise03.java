package Chapter06;



public class Exercise03 {

        static void main(String[] args) {
        int[] weights = {10000, 20000, 30000, 40000, 50000};
        int minWeight = weights[0];

        for (int i = 1; i < weights.length; i++) {
            if (weights[i] < minWeight) {
                minWeight = weights[i];
            }
        }

        System.out.println("The lightest dinosaur weighs: " + minWeight + "Kg.");
    }
}
