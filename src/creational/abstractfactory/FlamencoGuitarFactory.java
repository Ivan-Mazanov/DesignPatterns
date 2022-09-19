package creational.abstractfactory;

import creational.abstractfactory.bodies.Body;
import creational.abstractfactory.bodies.ClassicBody;
import creational.abstractfactory.fretboards.ClassicFretboard;
import creational.abstractfactory.fretboards.Fretboard;
import creational.abstractfactory.strings.NylonStrings;
import creational.abstractfactory.strings.Strings;

public class FlamencoGuitarFactory implements GuitarFactory {
    @Override
    public Fretboard createFretboard() {
        return new ClassicFretboard();
    }

    @Override
    public Body createBody() {
        return new ClassicBody();
    }

    @Override
    public Strings createStrings() {
        return new NylonStrings();
    }
}
