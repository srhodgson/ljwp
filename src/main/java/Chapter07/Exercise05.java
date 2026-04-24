package Chapter07;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";

        System.out.println("Hello, please enter your name: ");
        name = sc.next();

        System.out.println(welcomeMessage(name));
    }

    public static String welcomeMessage(String guestName) {
        return "Hello " + guestName + ", Gnasher is excited to meet you.";
    }
}
