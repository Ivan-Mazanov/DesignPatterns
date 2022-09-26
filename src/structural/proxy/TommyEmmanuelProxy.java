package structural.proxy;

public class TommyEmmanuelProxy implements Guitarist{

    private Guitarist tommyEmmanuel;

    @Override
    public void play() {
        //Настроил гитару
        tommyEmmanuel.play();
    }

    public TommyEmmanuelProxy(Guitarist tommyEmmanuel) {
        this.tommyEmmanuel = tommyEmmanuel;
    }
}
