package Chapter06;

public class Exercise06 {
    public static void main(String[] args) {
        String[][] parkMap = {
            {"Enclosure 1", "Facility 1"},
                {"Enclosure 2", "Facility 2"},
                {"Enclosure 3", "Facility 3"},
                {"Enclosure 4", "Facility 4"}
        };

        for (String[] row : parkMap) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}