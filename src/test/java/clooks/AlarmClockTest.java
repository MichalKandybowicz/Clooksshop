package clooks;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmClockTest {

    @Test
    void howLongTimeToAlarm1() {
        AlarmClock clock = new AlarmClock(0, 16, 0, 0);
        clock.setAlarmTime(7, 11);
        Assert.assertEquals("To alarm u have: 6:55", clock.howLongTimeToAlarm());
    }
    @Test
    void howLongTimeToAlarm2() {
        AlarmClock clock = new AlarmClock(0, 11, 8, 0);
        clock.setAlarmTime(8, 10);
        Assert.assertEquals("To alarm u have: 23:59", clock.howLongTimeToAlarm());
    }
    @Test
    void howLongTimeToAlarm3() {
        AlarmClock clock = new AlarmClock(0, 10, 7, 0);
        clock.setAlarmTime(7, 10);
        Assert.assertEquals("To alarm u have: 0:0", clock.howLongTimeToAlarm());
    }
}