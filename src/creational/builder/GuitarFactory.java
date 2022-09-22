package creational.builder;

public class GuitarFactory {
    private GuitarBuilder builder;

    public GuitarFactory(GuitarBuilder builder) {
        this.builder = builder;
    }
    public Guitar build(){
        return builder.addBody().addFretboard().addHead().addStrings().build();
    }
}
