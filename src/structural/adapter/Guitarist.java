package structural.adapter;

public class Guitarist {

    private Guitar guitar;

    public void play(){
        guitar.strum();
    }

    public Guitarist(Guitar guitar){
        this.guitar = guitar;
    }
}
