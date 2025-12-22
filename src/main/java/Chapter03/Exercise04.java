package Chapter03;

public class Exercise04 {
    public static void main(String[] args) {
        int maxCapacity = 250;
        int currentVisitors = 300;
        boolean maxCapacityReached = false;

        if (currentVisitors >= maxCapacity)
            maxCapacityReached = true;

        System.out.println("Max capacity reached: " +maxCapacityReached);

    }
}
