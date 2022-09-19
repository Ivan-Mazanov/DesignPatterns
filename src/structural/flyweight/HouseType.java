package structural.flyweight;

public class HouseType {
    private String name;
    private int numberOfFloors;
    private String heatingType;
    private String waterSupplyType;

    public HouseType(int numberOfFloors, String heatingType, String waterSupplyType, String name) {
        this.numberOfFloors = numberOfFloors;
        this.heatingType = heatingType;
        this.waterSupplyType = waterSupplyType;
        this.name = name;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getHeatingType() {
        return heatingType;
    }

    public void setHeatingType(String heatingType) {
        this.heatingType = heatingType;
    }

    public String getWaterSupplyType() {
        return waterSupplyType;
    }

    public void setWaterSupplyType(String waterSupplyType) {
        this.waterSupplyType = waterSupplyType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
