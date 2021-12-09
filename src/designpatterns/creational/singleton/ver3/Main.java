package designpatterns.creational.singleton.ver3;


public class Main {

    public static void main(String[] args) {


        new Thread(()-> {
            Earth instance = Earth.INSTANCE;
        }).start();
        new Thread(()-> {
            Earth instance = Earth.INSTANCE;
        }).start();
    }
}
