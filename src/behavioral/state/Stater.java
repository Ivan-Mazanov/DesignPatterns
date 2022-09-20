package behavioral.state;

public class Stater {
    private State state;

    public void doSomething(){
        state.doSomething();
    }
}
