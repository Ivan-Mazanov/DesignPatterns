package structural.proxy;

public class TommyEmmanuelProxy implements Guitarist{

    private Guitarist tommyEmmanuel;

    @Override
    public void play() {
        if (tommyEmmanuel == null){
            tommyEmmanuel = new TommyEmmanuel();
        }
        //Настроил гитару
        tommyEmmanuel.play();
    }
}
