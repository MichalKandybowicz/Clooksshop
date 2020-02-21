package clooks;

import java.util.Random;

public class WallClock extends Clock {

    private final static String theSound = "Cuckoo";

    public WallClock(int sec,
                     int min,
                     int h,
                     int timeSpeed) {
        super(sec,
                min,
                h,
                timeSpeed);

        this.sound = theSound;
    }

    public void setRandomTimeSpeed() {
        Random random = new Random();
        timeSpeed = random.nextInt(5) - 2;

    }

    @Override
    public void passTime() {

        sec = sec + 1 + ((float) timeSpeed / 60);
        if (sec  % 3600 == 0){
            saySound();
//            setRandomTimeSpeed();
        }

    }
}
