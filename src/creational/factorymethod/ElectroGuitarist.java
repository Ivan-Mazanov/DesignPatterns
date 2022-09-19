package creational.factorymethod;

public class ElectroGuitarist extends Guitarist {
    @Override
    public Guitar createGuitar() {
        return new ElectroGuitar();
    }
}
