package creational.abstractfactory;

import creational.abstractfactory.bodies.Body;
import creational.abstractfactory.fretboards.Fretboard;
import creational.abstractfactory.strings.Strings;

public interface GuitarFactory {
    Fretboard createFretboard();
    Body createBody();
    Strings createStrings();
}
