package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HouseComposite {
    private List<HouseComposite> childrens = new ArrayList<>();
    public void add(HouseComposite houseComposite){
        childrens.add(houseComposite);
    }

}
