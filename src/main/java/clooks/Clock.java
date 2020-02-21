package clooks;

public abstract class Clock {

    private final int DURATION_DAY = 24;
    private final int DURATION_HOUR = 60;
    private final int DURATION_MINUTE = 60;


    protected String sound;
    float sec;
    int timeSpeed;

    Clock( int sec, int min, int h, int timeSpeed) {
        setTime(h, min, sec);
        this.timeSpeed = timeSpeed;
    }



    private void setTime(int h, int min, int sec){

        if (h < 0 || h > DURATION_DAY){
            throw new IllegalArgumentException("Hour must be >= 0, and be < 60 now is: " + h);
        }
        if (min < 0 || min > DURATION_HOUR){
            throw new IllegalArgumentException("Min must be >= 0, and be < 60 now is: " + min);
        }
        if (sec < 0 || sec > DURATION_MINUTE){
            throw new IllegalArgumentException("Sec must be >= 0 and be < 60, now is: " + sec);

        }
        this.sec += h * 3600;
        this.sec += min * 60;
        this.sec += sec;
    }

    void saySound(){
        System.out.println(this.sound);
    }

    public void passTime(){

        sec++;
        if (sec % 3600 == 0){
            saySound();
        }

    }

    void passTime(int howManySec) {
        for (int i = 0; i < howManySec ; i++){
            passTime();
        }
    }

    int getSec() {
        return (int) sec % 60;
    }

    int getMin() {
        return  ((int) sec % 3600) / 60  ;
    }

    public int getH() {
        return (int) sec / 3600;
    }

    public void setH(int h)
    {
        this.sec += h * 3600;
    }
    public void setMin(int min) {
        this.sec += min * 60;
    }

    public void setSec(int sec) {
        this.sec += (this.sec % 60) + sec;
    }
}
