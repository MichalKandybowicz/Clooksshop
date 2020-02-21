package clooks;

import java.util.ArrayList;
import java.util.List;

public class AlarmClook extends Clook {

    private List < Integer > alarmTime = new ArrayList< Integer >();

    String sound = "Buzzz";
    public AlarmClook(int sec, int min, int h, int timeSpeed) {
        super(sec, min, h, timeSpeed);
        this.sec = sec;
        this.min = min;
        this.h = h;
        this.timeSpeed = timeSpeed;
    }

    public void setAlarmTime(List< Integer > alarmTime) {
        this.alarmTime = alarmTime;
    }


}
