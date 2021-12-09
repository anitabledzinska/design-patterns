package designpatterns.creational.singleton.ver2;

public class Earth {

    private static Earth INSATNCE;

    public static Earth getInstance() {
        if (INSATNCE == null) {
            synchronized (Earth.class) {
                if (INSATNCE == null) {
                    INSATNCE = new Earth();
                }
            }
        }
        return INSATNCE;
    }


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
