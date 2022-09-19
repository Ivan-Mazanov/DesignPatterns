package behavioral.mediator;

public class Mediator {
    private Architector architector;
    private Builder builder;
    private Decorator decorator;
    private House house;
    private Plan plan;

    public void makePlan() {
        this.plan = architector.makePlan();
    }

    public void buildHouse() {
        this.house = builder.buildHouse(plan);
    }

    public void decorateHouse() {
        this.house = decorator.decorateHouse(house);
    }

    public Mediator(Architector architector, Builder builder, Decorator decorator, House house, Plan plan) {
        this.architector = architector;
        this.builder = builder;
        this.decorator = decorator;
        this.house = house;
        this.plan = plan;
    }
}
