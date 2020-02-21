package clooks;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallClockTest {

// FASTER PART
    @Test
    void useTimeSpeedFaster1secTest60sec() {
        int sec = 1;
        int min = sec * 60;
        int cycles = min;

        int timeSpeed = 1;
        WallClock clock = new WallClock(0, 0, 0, timeSpeed, "BingBong");
        clock.passTime(cycles);
        Assert.assertEquals(  1  , clock.getSec());
    }
    @Test
    void useTimeSpeedFaster1Test60sec() {
        int sec = 1;
        int min = sec * 60;
        int cycles = min;
        int timeSpeed = 1;

        WallClock clock = new WallClock(0, 5, 0, timeSpeed, "BingBong");
        clock.passTime(cycles);
        Assert.assertEquals(  6  , clock.getMin());
    }
    @Test
    void useTimeSpeedFaster24hTestMin() {
        int sec = 1;
        int min = sec * 60;
        int cycles = min;

        int timeSpeed = 1;

        WallClock clock = new WallClock(0, 0, 0, timeSpeed, "BingBong");
        clock.passTime(cycles);
        Assert.assertEquals(  1  , clock.getMin());
    }


    // SLOWLY PART
    @Test
    void useTimeSpeedSlowly1sTest60s() {
        int sec = 1;
        int min = sec * 60;
        int cycles = min;

        int timeSpeed = -1;
        WallClock clock = new WallClock(0, 0, 0, timeSpeed, "BingBong");
        clock.passTime(cycles);
        Assert.assertEquals(  59  , clock.getSec());
    }
    @Test
    void useTimeSpeedSlowlyHCycle() {
        int sec = 1;
        int min = sec * 60;
        int h = min * 60;
        int cycles = h * 1;

        int timeSpeed = -1;

        WallClock clock = new WallClock(0, 0, 0, timeSpeed, "BingBong");
        clock.passTime(cycles);
        Assert.assertEquals(  1  , clock.getSec());
    }
    @Test
    void useTimeSpeedSlowly24HCycle() {
        int sec = 1;
        int min = sec * 60;
        int h = min * 60;
        int day =  h * 24;
        int cycles = day;
        int timeSpeed = -1;
        WallClock clock = new WallClock(0, 0, 0, timeSpeed, "BingBong");
        clock.passTime(cycles);
        Assert.assertEquals( 36, clock.getMin());
    }

}