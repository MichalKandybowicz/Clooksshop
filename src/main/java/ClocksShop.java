import clooks.*;

import java.util.*;

public class ClooksShop {


    private static final int WALL_CLOOK = 3;
    private static final int WATCHES = 5;
    private static final int ALARM_CLOOK = 5;
    private List <Clook> clookList = new ArrayList< Clook >();


    public static void main(String[] args) {
        ClooksShop clooksShop = new ClooksShop();
        clooksShop.createCloks();


    }

    private void createCloks(){
        for (int i = 0; i < WALL_CLOOK; i++) {
            clookList.add(new WallClook(0, 0, 0, 0));
        }for (int i = 0; i < WATCHES; i++) {
            clookList.add(new Watches("red", 0, 0, 0, 0));
        }for (int i = 0; i < ALARM_CLOOK; i++) {
            clookList.add(new AlarmClook(0, 0, 0, 0));
        }
        clookList.add(BigBen.getInstance(0, 0,0,0));
    }

//    private void stimulationTime(int hawLong){
//        for (Clook clock: clookList) {
//
//
//        }
//    }
}
