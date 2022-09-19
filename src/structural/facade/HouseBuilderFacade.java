package structural.facade;

public class HouseBuilderFacade {
    private HouseBuilder houseBuilder;
    public House buildHouse(){
        houseBuilder.makeFoundation();
        houseBuilder.buildWalls();
        houseBuilder.makeRoof();
        houseBuilder.insertDoor();
        houseBuilder.insertWindows();
        return new House();
    }

    public HouseBuilderFacade(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
}
