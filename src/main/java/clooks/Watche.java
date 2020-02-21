package clooks;

public class Watches extends Clock {

    private final String color;
    private String sound = "Tick Tock";

    public Watches(final String color, int sec, int min, int h, int timeSpeed) {
        super(sec, min, h, timeSpeed);
        this.timeSpeed = timeSpeed;
        this.color = color;

    }
}
