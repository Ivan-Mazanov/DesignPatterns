package creational.abstractfactory;

import creational.abstractfactory.bodies.Body;
import creational.abstractfactory.bodies.DreadnoughtBody;
import creational.abstractfactory.fretboards.Fretboard;
import creational.abstractfactory.fretboards.ThinFretboard;
import creational.abstractfactory.strings.MetalStrings;
import creational.abstractfactory.strings.Strings;

public class AcousticGuitarFactory implements GuitarFactory {
    @Override
    public Fretboard createFretboard() {
        return new ThinFretboard();
    }

    @Override
    public Body createBody() {
        return new DreadnoughtBody();
    }

    @Override
    public Strings createStrings() {
        return new MetalStrings();
    }
}
