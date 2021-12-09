package designpatterns.creational.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        ChristmasTree christmasTree = new ChristmasTree(170, "Jodła Kaukaska", true);
        System.out.println(christmasTree);
        ChristmasTree clone = christmasTree.clone();
        System.out.println(clone);
    }
}
