package creational.builder;

public class FlamencoGuitarBuilder implements GuitarBuilder{
    private String fretBoard;
    private String body;
    private String head;
    private String strings;

    @Override
    public GuitarBuilder addBody() {
        return this;
    }

    @Override
    public GuitarBuilder addFretboard() {
        return this;
    }

    @Override
    public GuitarBuilder addStrings() {
        return this;
    }

    @Override
    public GuitarBuilder addHead() {
        return this;
    }

    @Override
    public Guitar build() {
        Guitar guitar = new Guitar(fretBoard, body, head, strings);
        if(guitar.guitarCheck()){
            return guitar;
        }
        //Как то уведомить о проблеме
        return null;
    }
}
