package creational.factorymethod;

public class ClassicGuitarist extends Guitarist{
    @Override
    public Guitar createGuitar() {
        return new ClassicGuitar();
    }
}
