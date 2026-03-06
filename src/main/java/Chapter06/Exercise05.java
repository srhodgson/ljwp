package Chapter06;

public class Exercise05 {
    public static void main(String[] args) {
        int[] ages = { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43,
                44 };
        int totalAge = 0;
        double averageAge = 0.0;

        for (int age : ages) {
            totalAge += age;
        }

        averageAge = (double) totalAge / ages.length;

        System.out.println("The average age of our dinosaurs is: " + averageAge);
    }
}