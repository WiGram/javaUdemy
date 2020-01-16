package gram.william;

public class TV {
    private int size;
    private boolean isOn;

    public TV(int size, boolean isOn) {
        this.size = size;
        this.isOn = isOn;
    }

    public void turnOn() {
        System.out.println("TV is turned on");
    }

    public void turnOff() {
        System.out.println("TV is turned off");
    }
}
