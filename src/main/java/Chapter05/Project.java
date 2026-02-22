package Chapter05;

public class Project {
    static void main(String[] args) {
        int tRex = 250;
        int triceratops = 400;

        for (int time = 0; time < 24; time++) {
            if (time == 8 || time == 12 || time == 16 || time == 20)
                System.out.println("It's " + time + ":00 - Feeding time for T-Rex with " + tRex + "Kg of food.");

            if (time == 10 || time == 14 || time == 18 || time == 22)
                System.out.println("It's " + time + ":00 - Feeding time for Triceratops with " + triceratops + "Kg of food.");
        }
    }
}
