package clooks;

public class AlarmClock extends Clock {

    private int alarmH;
    private int alarmMin;


    private final static String theSound = "Cuckoo";


    public AlarmClock(int sec,
                      int min,
                      int h,
                      int timeSpeed) {
        super(sec,
                min,
                h,
                timeSpeed);
        this.sound = theSound;
    }

    void setAlarmTime(int AlarmH, int alarmMin) {
        this.alarmH = AlarmH;
        this.alarmMin = alarmMin;
    }

    String howLongTimeToAlarm(){

        int alarmTimeInMin = alarmH * 60 + alarmMin;
        int actualTimeInMin = (int) sec / 60;


        int timeToAlarm = alarmTimeInMin - actualTimeInMin;

        if (timeToAlarm >= 0){
            int timeToAlarmInMin = timeToAlarm % 60;
            int timeToAlarmInH = timeToAlarm / 60;
            return "To alarm u have: " + timeToAlarmInH + ":" + timeToAlarmInMin;
        }
        else {
            int minInDay = 1440;
            timeToAlarm += minInDay;
            int timeToAlarmInMin = timeToAlarm % 60;
            int timeToAlarmInH = timeToAlarm / 60;
            return "To alarm u have: " + timeToAlarmInH + ":" + timeToAlarmInMin;

        }


    }

}
