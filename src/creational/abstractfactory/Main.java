package creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        GuitarFactory guitar = new ElectroGuitarFactory();
        guitar.createBody();
        guitar.createStrings();
        guitar.createFretboard();
    }
}
