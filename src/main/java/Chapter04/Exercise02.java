package Chapter04;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a dino breed -->");
        String dino = sc.next();

        switch (dino) {
            case "TRex":
                System.out.println("This dino has two legs, small arms, and eats meat!");
                break;
            case "TriTops":
                System.out.println("This dino has for legs, three horns, and eats plants!");
                break;
            case "VRaptor":
                System.out.println("This dino has two legs, big claws, and runs really fast!");
                break;
        }
    }
}
