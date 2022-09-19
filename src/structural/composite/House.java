package structural.composite;

import java.util.List;

public class House extends HouseComposite{
    public House(List<Apartment> apartments){
        apartments.forEach(this::add);
    }
}
