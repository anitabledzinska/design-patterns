package designpatterns.behavioral.chainofresponsibility;

public class Adult extends FireChainLink {
    public Adult(FireChainLink next) {
        super(next);
    }

    @Override
    public void handle(int flamesHeight) {
        if(flamesHeight<5) {
            System.out.println("Osoba dorosła zdołała ugasić pożar");
        }   else {
                System.out.println("Pożar za duży. Wołać straż.");
                next.handle(flamesHeight);
            }
            }
        }


