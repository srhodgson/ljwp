package Chapter04;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jobTitle = "";

        try {
            System.out.println("Please enter job title -->");
            jobTitle = sc.next();
        } finally {
            sc.close();
        }

        switch (jobTitle) {
            case "Warden":
                System.out.println("Assigned task: Check fence integrity");
                break;
            case "Intern":
                System.out.println("Assigned task: Check feed stores");
                break;
            case "Junior Warder":
                System.out.println("Assigned task: Feed animals");
                break;
        }
    }
}
