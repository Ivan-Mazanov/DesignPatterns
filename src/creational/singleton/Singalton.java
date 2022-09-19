package creational.singleton;

public final class Singalton {
    private static Singalton instance;
    private Singalton(){
    }

    public static Singalton getInstance() {
        if(instance == null){
            instance = new Singalton();
        }
        return instance;
    }
}
