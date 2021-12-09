package designpatterns.behavioral.observer;

public class Billboard implements PressObserver {
    @Override
    public void update(String newspaper) {
        System.out.println("Billboard wyświetla reklamę gazety: " + newspaper);

    }
}
