package Chapter03;


public class Project {
    public static void main(String[] args) {
        int weight = 2000;
        float weightPercentage = weight * 0.5f;
        int totalFeedings = 3;
        float foodPerServing = weightPercentage / totalFeedings;

        System.out.println("Our " + weight + "kg dino needs to eat " + weightPercentage + "kg of food a day, this is split into " +  String.format("%.2f", foodPerServing) + "kg portions per day.");
    }
}
