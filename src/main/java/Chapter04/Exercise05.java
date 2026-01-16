package Chapter04;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dinoSize = "";

        try {
            System.out.println("Please enter the dino's size (XS, S, M, L, XL) -->");
            dinoSize = sc.next();
        } finally {
            sc.close();
        }

        switch (dinoSize) {
            case "XS":
                System.out.println("Assigned enclosure: Waterloo");
                break;
            case "S":
                System.out.println("Assigned enclosure: Somme");
                break;
            case "M":
                System.out.println("Assigned enclosure: Arras");
                break;
            case "L":
                System.out.println("Assigned enclosure: Ypres");
                break;
            case "XL":
                System.out.println("Assigned enclosure: Gothic Line");
                break;
        }

    }
}
