package structural.flyweight;

public class House {
    private String street;
    private String houseNumber;
    private HouseType houseType;

    public House(String street, String houseNumber, HouseType houseType) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.houseType = houseType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }
}
