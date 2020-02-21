import clooks.*;
import sun.jvm.hotspot.utilities.ObjectReader;

import java.util.*;

public class ClocksShop {


    private static final int WALL_CLOCK = 2;
    private static final int WATCHES = 2;
    private static final int ALARM_CLOCK = 2;
    private List < Clock > clocksList = new ArrayList< Clock >();

    public static void main(String[] args) {
        int HOW_MANY_SEC = 6000;

        ClocksShop clocksShop = new ClocksShop();

        clocksShop.createClocks();
        clocksShop.timeSimulation(HOW_MANY_SEC);


    }

    private void createClocks() {


        for (int i = 0; i < WALL_CLOCK; i++) {
            clocksList.add(new WallClock(0, 0, 0, 0));
        }

        for (int i = 0; i < WATCHES; i++) {
            clocksList.add(new Watche("red", 0, 0, 0, 0));
        }

        for (int i = 0; i < ALARM_CLOCK; i++) {
            clocksList.add(new AlarmClock(0, 0, 0, 0));
        }

        clocksList.add(BigBen.getInstance(0, 0, 0, 0));

    }

    private void timeSimulation(int howManySeconds) {
        for (int i = 0; i < howManySeconds; i++) {
            for (Clock clock:clocksList) {
                clock.passTime();
            }

        }
    }
}



