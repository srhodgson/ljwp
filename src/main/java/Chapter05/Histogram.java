package Chapter05;

public class Histogram {
    public static void main(String[] args) {
        int[] data = {9, 3, 5, 7};

        System.out.println("[]\t[n]\tHistogram");
        for (int i=0; i < data.length; i++) {
            System.out.print(i + "\t" + data[i] + "\t");
            for (int j=1; j <= data[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("I, j");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    break; // breaks out of inner loop
                }
                System.out.println(i + ", " + j);
            }
        }

        System.out.println();

        System.out.println("i, j"); // placed BEFORE label!!
        OUTERLOOP:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    break OUTERLOOP; // case-sensitive
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println("Here");

        System.out.println();

        System.out.println("i, j");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    continue; // next iteration
                }
                System.out.println(i +", " + j);
            }
        }

        System.out.println();

        System.out.println("i, j\n===="); // placed BEFORE label
        OUTERLOOP:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    continue OUTERLOOP; // continues with OUTERLOOP
                }
                System.out.println(i + ", " + j);
            }
        }
    }
}
