package designpatterns.behavioral.chainofresponsibility;

public class Main {

    public static void main(String[] args) {

        FireFighter fireFighter = new FireFighter(null);
        Adult adult = new Adult(fireFighter);
        Child child = new Child(adult);

        child.handle(4);
        child.handle(14);


    }
}
