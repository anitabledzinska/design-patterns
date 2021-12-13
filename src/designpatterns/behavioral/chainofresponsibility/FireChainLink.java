package designpatterns.behavioral.chainofresponsibility;

public abstract class FireChainLink {
    protected FireChainLink next;


    public FireChainLink(FireChainLink next) {
        this.next = next;
    }

    public abstract void handle(int flamesHeight);

    public void setNext(FireChainLink next) {
        this.next = next;
    }
}
