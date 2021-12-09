package designpatterns.creational.prototype.ver1;

public class ChristmasTree implements Cloneable {
    private int height;
    private String species;
    private boolean decorated;

    @Override
    public ChristmasTree clone() throws CloneNotSupportedException {
        return (ChristmasTree) super.clone();
    }

    @Override
    public String toString() {
        return "ChristmasTree{" +
                "height=" + height +
                ", speies='" + species + '\'' +
                ", decorated=" + decorated +
                '}';
    }

    public ChristmasTree(int height, String speies, boolean decorated) {
        this.height = height;
        this.species = speies;
        this.decorated = decorated;
    }
}
