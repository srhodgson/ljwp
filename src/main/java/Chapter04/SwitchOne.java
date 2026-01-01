package Chapter04;

import java.util.Scanner;

public class SwitchOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sport;

        try {
            System.out.print("Enter a sport --> ");
            sport = sc.next();
        } finally {
            sc.close();
        }
        

        switch(sport){
            case "Soccer":
                System.out.println("I play soccer");
                break;
            case "Rugby":
                System.out.println("I play Rugby");
                break;
            default: // can be moved around
                System.out.println("Unknown sport");
                break;
        }
    }
}
