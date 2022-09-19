package behavioral.state;

public abstract class State {
    private Stater stater;

    public State(Stater stater) {
        this.stater = stater;
    }

    public abstract void doSomething();
}
