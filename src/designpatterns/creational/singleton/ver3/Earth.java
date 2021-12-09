package designpatterns.creational.singleton.ver3;

public enum Earth {
    INSTANCE;


    private Earth() {
        System.out.println("Tworzę instancję typu Earth");
    }

    ///////////////////////////////////////////
    private  double mass = 12344566;

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

}
