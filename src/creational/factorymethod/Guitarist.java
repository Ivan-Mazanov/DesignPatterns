package creational.factorymethod;

public abstract class Guitarist {
    public void play(Guitar guitar){
        guitar.play();
    }
    public abstract Guitar createGuitar();
}
