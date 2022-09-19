package behavioral.chainofresponsibilities;

public abstract class Check {
    private Check next;

    public abstract boolean check();

    public Check(Check next) {
        this.next = next;
    }

    public static Check makeChain(Check first, Check... chain) {
        Check head = first;
        for (Check nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public boolean nextCheck(){
        if (next != null){
            return next.check();
        }
        return true;
    }
}
