package Chapter06;

public class Exercise07 {
    static void main(String[] args) {
        String[][] busSeats = {
                {"Seat 1", "Seat 2"},
                {"Seat 3", "Seat 4"},
                {"Seat 5", "Seat 6"}
        };

        for (int i = 0; i < busSeats.length; i++) {
            for (int j = 0; j < busSeats[i].length; j++) {
                System.out.println(busSeats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
