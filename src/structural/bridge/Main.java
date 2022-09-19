package structural.bridge;

public class Main {
    public static void main(String[] args) {
        Flashlight flashlight = new OldFlashlight(new NiCaBattery(), 4);
    }
}
