package clooks;

public class BigBen extends Clock {


    private final static String theSound = "Cuckoo";


    private BigBen(int sec,
                   int min,
                   int h,
                   int timeSpeed) {
        super(sec,
                min,
                h,
                timeSpeed);

        this.sound = theSound;
    }

    private static BigBen INSTANCE;

    public static BigBen getInstance(int sec,
                                     int min,
                                     int h,
                                     int timeSpeed){
        if (INSTANCE == null){
            INSTANCE = new BigBen(
                    sec,
                    min,
                    h,
                    timeSpeed);
        }
        return INSTANCE;
    }
}
