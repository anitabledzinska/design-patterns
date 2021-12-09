package designpatterns.behavioral.strategy;

public class SwordSwingStrategy implements HitStrategy {
    @Override
    public void hit() {
        System.out.println("Zamachnięcie mieczem");

    }
}
