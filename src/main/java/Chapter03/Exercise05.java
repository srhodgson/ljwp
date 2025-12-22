package Chapter03;

public class Exercise05 {
    public static void main(String[] args) {
        int age1 = 34;
        int age2 = 12;
        int ageDifference = 0;

        if (age1 > age2) {
            ageDifference = age1 - age2;

            System.out.println("The difference in age between the two dinos is " + ageDifference + " years.");
        }

        if (age2 > age1) {
            ageDifference = age2 - age1;

            System.out.println("The difference in age between the two dinos is " + ageDifference +  " years.");
        }

        if (age1 == age2)
            System.out.println("The two dinos are the same age.");
    }
}
