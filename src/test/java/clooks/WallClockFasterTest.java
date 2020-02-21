package clooks;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallClockFasterTest {

    @Test
    void useTimeSpeed_60_sec() {
        int sec = 1;
        int min = sec * 60;
        int cycles = min;

        int timeSpeed = 1;
        WallClock clock = new WallClock(0, 0, 0, timeSpeed);
        clock.passTime(cycles);
        Assert.assertEquals(1, clock.getSec());
    }

    @Test
    void useTimeSpeed_60_sec_v2() {
        int sec = 1;
        int min = sec * 60;
        int cycles = min;
        int timeSpeed = 1;

        WallClock clock = new WallClock(0, 5, 0, timeSpeed);
        clock.passTime(cycles);
        Assert.assertEquals(6, clock.getMin());
    }

    @Test
    void useTimeSpeed_24_H() {
        int sec = 1;
        int min = sec * 60;
        int h = min * 60;
        int day =  h * 24;

        int timeSpeed = 1;

        WallClock clock = new WallClock(5, 2, 1, timeSpeed);
        clock.passTime(day);
        Assert.assertEquals(26, clock.getMin());
    }
}