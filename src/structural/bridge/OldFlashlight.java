package structural.bridge;

public class OldFlashlight implements Flashlight{
    private Battery battery;
    private int lightBulbCount;
    public OldFlashlight(Battery battery, int lightBulbCount){
        this.battery = battery;
        this.lightBulbCount = lightBulbCount;
    }
}
