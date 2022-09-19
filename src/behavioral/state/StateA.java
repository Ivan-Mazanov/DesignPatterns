package behavioral.state;

public class StateA extends State{
    public StateA(Stater stater) {
        super(stater);
    }

    @Override
    public void doSomething() {
        //do something like A and set state B
    }
}
