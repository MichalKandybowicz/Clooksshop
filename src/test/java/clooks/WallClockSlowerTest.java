package clooks;

import org.junit.Assert;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallClockSlowerTest {

    @Test
    void useTimeSpeed_1_min() {
        int sec = 1;
        int min = sec * 60;
        int cycles = min;

        int timeSpeed = -1;

        WallClock clock = new WallClock(0, 0, 0, timeSpeed);
        clock.passTime(cycles);
        Assert.assertEquals(  59  , clock.getSec());
    }

    @Test
    void useTimeSpeed_1_hour() {
        int sec = 1;
        int min = sec * 60;
        int h = min * 60;
        int cycles = h * 1;

        int timeSpeed = -1;

        WallClock clock = new WallClock(0, 0, 0, timeSpeed);
        clock.passTime(cycles);
        Assert.assertEquals(  59  , clock.getMin());
    }
    @Test
    void useTimeSpeed_24_hours() {
        int sec = 1;
        int min = sec * 60;
        int h = min * 60;
        int day =  h * 24;
        int cycles = day;
        int timeSpeed = -1;
        WallClock clock = new WallClock(0, 0, 0, timeSpeed);
        clock.passTime(cycles);
        Assert.assertEquals( 36, clock.getMin());
    }

}