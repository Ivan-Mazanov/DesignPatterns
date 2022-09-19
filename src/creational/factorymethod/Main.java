package creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        Guitarist guitarist = new ElectroGuitarist();
        Guitar guitar = guitarist.createGuitar();
        guitarist.play(guitar);
    }
}
