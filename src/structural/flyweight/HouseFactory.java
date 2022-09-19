package structural.flyweight;

import java.util.Map;

public class HouseFactory {
    private static Map<String, HouseType> houseTypeMap;

    public static HouseType getHouseType(int numberOfFloors, String heatingType, String waterSupplyType, String name){
        HouseType result = houseTypeMap.get(name);
        if(result == null){
            result = new HouseType(numberOfFloors, heatingType, waterSupplyType, name);
            houseTypeMap.put(name, result);
        }
        return result;
    }
}
