package Chapter03;

import java.time.Year;

public class Exercise03 {
    public static void main(String[] args) {
        int currentYear =  1600;// Year.now().getValue();
        boolean isCurrentYearLeap = false;

        if (currentYear % 4 == 0) {
            if (currentYear % 100 == 0){
                if (currentYear % 400 == 0) {
                    isCurrentYearLeap = true;
                } else {
                    isCurrentYearLeap = false;
                }
            } else {
                isCurrentYearLeap = true;
            }
        } else {
            isCurrentYearLeap = false;
        }

        System.out.println("Is the current year a leap year? " +  isCurrentYearLeap);
    }
}
