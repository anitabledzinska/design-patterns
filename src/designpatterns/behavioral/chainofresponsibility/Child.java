package designpatterns.behavioral.chainofresponsibility;

public class Child extends FireChainLink {

    public Child(FireChainLink next) {
        super(next);
    }

    @Override
    public void handle(int flamesHeight) {
        System.out.println("Dziecko widzi pożar, woła następną osobę i ucieka");
        next.handle(flamesHeight);

    }
}
