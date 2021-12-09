package designpatterns.behavioral.strategy;

public class Main {

    public static void main(String[] args) {

        Warrior warrior = new Warrior(new PunchStrategy());
        warrior.hit();
        warrior.setHitStrategy(new SwordSwingStrategy());
        warrior.hit();

    }
}
