package clooks;

public abstract class Clook {

    private final int DURATION_DAY = 24;
    private final int DURATION_HOUR = 60;
    private final int DURATION_MINUTE = 60;
    private final int DURATION_SECOND = 60;

    private String sound ;
    int sec;
    int min;
    int h;
    int timeSpeed;

    public Clook(int sec, int min, int h, int timeSpeed) {
        if (h <= 0 || h > DURATION_DAY){
            throw new IllegalArgumentException("Hour must be >= 0, and be < 60 now is: " + h);
        }
        if (min <= 0 || min > DURATION_HOUR){
            throw new IllegalArgumentException("Min must be >= 0, and be < 60 now is: " + min);
        }
        if (sec <= 0 || sec > DURATION_MINUTE){
            throw new IllegalArgumentException("Sec must be >= 0 and be < 60, now is: " + sec);

        }
        this.timeSpeed = timeSpeed;
        this.h = h;
        this.min = min;
        this.sec = sec;
    }

    private void saySound(){
        System.out.println(sound);
    }

    private void setTime(int h, int min, int sec){

        if (h <= 0 || h > DURATION_DAY){
            throw new IllegalArgumentException("Hour must be >= 0, and be < 60 now is: " + h);
        }
        if (min <= 0 || min > DURATION_HOUR){
            throw new IllegalArgumentException("Min must be >= 0, and be < 60 now is: " + min);
        }
        if (sec <= 0 || sec > DURATION_MINUTE){
            throw new IllegalArgumentException("Sec must be >= 0 and be < 60, now is: " + sec);

        }
        this.h = h;
        this.min = min;
        this.sec = sec;
    }


    public void passTime(int howLong) {
        for (int i = 0; i < howLong; i++){
            sec ++;
            if (sec == DURATION_SECOND) {
                sec = 0;
                min++;
            }
            if (min == DURATION_MINUTE) {
                min = 0;
                h++;
                saySound();
            }
            if (h == 24) {
                h = 0;
            }
        }
    }

    public void setTimeSpeed(int timeSpeed) {
        this.timeSpeed = timeSpeed;
    }
}
