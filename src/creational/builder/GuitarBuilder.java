package creational.builder;

public interface GuitarBuilder {
    GuitarBuilder addBody();
    GuitarBuilder addFretboard();
    GuitarBuilder addStrings();
    GuitarBuilder addHead();
    Guitar build();
}
