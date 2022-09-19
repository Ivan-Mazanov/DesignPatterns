package creational.prototype;

import java.io.File;
import java.util.Calendar;

public class Guitar implements Cloneable{
    private int a;
    private int b;
    private Calendar calendar;
    public Guitar clone() throws CloneNotSupportedException {
        Guitar cloneGuitar = (Guitar) super.clone();
        cloneGuitar.calendar = (Calendar) calendar.clone();
        return cloneGuitar;
    }
}
