package Chapter07;

public class Exercise06 {
    public static void main(String[] args) {
        int maxGuests = 500;
        int currentGuests = 475;
        int nextGrpSize = 35;

        System.out.println("Can the next group enter the park? " + admitNextGrp(nextGrpSize, currentGuests, maxGuests));
    }
    public static Boolean admitNextGrp(int nextGrpSize, int currentGuests, int maxGuests) {
        Boolean retval = false;

        if (maxGuests - currentGuests >= nextGrpSize)
            retval = true;

        return retval;
    }
}
