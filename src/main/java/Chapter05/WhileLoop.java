package Chapter05;

public class WhileLoop {
    public static void main(String[] args) {
        int x = 1;

        while (x <= 3) {
            System.out.println("Loop: " + x); // 1, 2, 3
            x++;
        }
        System.out.println("Final x value is: " + x); // 4
    }
}
