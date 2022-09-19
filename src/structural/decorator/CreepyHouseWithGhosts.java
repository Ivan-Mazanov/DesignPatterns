package structural.decorator;

public class CreepyHouseWithGhosts implements House{
    private final CreepyHouse decorated;
    @Override
    public void boo() {
        decorated.boo();
        System.out.println("But he always watching.");
    }

    public CreepyHouseWithGhosts(CreepyHouse decorated) {
        this.decorated = decorated;
    }
}
