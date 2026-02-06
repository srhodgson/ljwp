package Chapter05;

import java.util.Scanner;

public class WhileLoopTwo {
    public static void main(String[] args) {
        int sum = 0;
        boolean keepGoing = true;
        int n = 0;
        while (keepGoing) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number (negative number to exit) --> ");
            n = sc.nextInt();

            if (n < 0) {
                keepGoing = false;
            } else {
                sum = sum + n; // sum += n
            }
        }
        System.out.println("Sum of numbers is: " + sum);
    }
}
