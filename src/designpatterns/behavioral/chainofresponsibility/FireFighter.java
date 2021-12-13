package designpatterns.behavioral.chainofresponsibility;

public class FireFighter extends FireChainLink {
    public FireFighter(FireChainLink next) {
        super(next);
    }

    @Override
    public void handle(int flamesHeight) {
        System.out.println("Strażak gasi pożar.");

    }
}
