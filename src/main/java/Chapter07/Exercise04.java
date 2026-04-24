package Chapter07;

import java.time.LocalTime;

public class Exercise04 {
    public static void main(String[] args) {

        if (isParkOpen()) {
            System.out.println("The park is currently open.");
        } else {
            System.out.println("The park is currently closed.");
        }
    }

    public static Boolean isParkOpen() {
        Boolean retval = false;
        LocalTime now = LocalTime.now();
        LocalTime open = LocalTime.parse("09:30");
        LocalTime close = LocalTime.parse("17:30");

        if (now.isAfter(open) && now.isBefore(close))
            retval = true;


        return retval;
    }
}
