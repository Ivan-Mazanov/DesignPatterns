package structural.adapter;

public class Main {
    public static void main(String[] args) {
        Guitarist guitarist = new Guitarist(new ViolinAdapter(new Violin()));
        guitarist.play();
    }
}
