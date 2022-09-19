package structural.bridge;

public class NewFlashlight implements Flashlight{
    private Battery battery;
    private int diodeCount;
    public NewFlashlight(Battery battery, int diodeCount){
        this.battery = battery;
        this.diodeCount = diodeCount;
    }
}
