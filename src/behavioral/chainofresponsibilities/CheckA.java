package behavioral.chainofresponsibilities;

public class CheckA extends Check{
    public CheckA(Check next) {
        super(next);
    }

    @Override
    public boolean check() {
        boolean someCheck = true;
        if(someCheck != true){
            return false;
        }
        return nextCheck();
    }
}
