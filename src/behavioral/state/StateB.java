package behavioral.state;

public class StateB extends State{

    public StateB(Stater stater) {
        super(stater);
    }

    @Override
    public void doSomething() {
        //do something like B
    }
}
