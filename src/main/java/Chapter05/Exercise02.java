package Chapter05;

public class Exercise02 {
    static void main(String[] args) {
        boolean full = false;

        do {
            for (int i = 1; i <= 25; i++) {
                System.out.println("Dino is still hungry, more food!");
                if (i == 25)
                    full = true;
            }
        } while (!full);
        System.out.println("The dino is full!");
    }
}
