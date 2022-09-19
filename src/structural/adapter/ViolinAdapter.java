package structural.adapter;

public class ViolinAdapter extends Guitar {

    private Violin violin;

    public ViolinAdapter(Violin violin){
        this.violin = violin;
    }

    @Override
    public void strum(){
        violin.vzhik();
    }
}
