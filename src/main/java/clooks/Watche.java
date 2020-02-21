package clooks;

public class Watche extends Clock {

    private final static String theSound = "Cuckoo";


    public Watche(final String color,
                  int sec,
                  int min,
                  int h,
                  int timeSpeed) {
        super(sec,
                min,
                h,
                timeSpeed);

        this.sound = theSound;

    }

}
