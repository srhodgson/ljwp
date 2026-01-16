package Chapter04;

import java.time.LocalTime;


public class Exercise08 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime openingTime = LocalTime.of(10, 0);
        LocalTime closingTime = LocalTime.of(19, 0);

        if (currentTime.isBefore(openingTime) || currentTime.isAfter(closingTime)) {
            System.out.println("The park is currently closed and will reopen at " + openingTime);
        }

    }
}
