package behavioral.visitor;

public class Guitar {

    public void doSomething(){
        //play
    }

    public void visitGuitar(Visitor visitor){
        visitor.visitGuitar();
    }
}
