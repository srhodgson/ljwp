package Chapter05;

public class Exercise03 {
    static void main(String[] args) {
        int countDown = 10;

        System.out.println("The park opens in: ");
        while (countDown != 0) {
            System.out.println(countDown);
            countDown = countDown - 1;
        }
        System.out.println("The park is now OPEN!");
    }
}
