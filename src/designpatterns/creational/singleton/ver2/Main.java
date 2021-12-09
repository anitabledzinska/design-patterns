package designpatterns.creational.singleton.ver2;


public class Main {

    public static void main(String[] args) {


        new Thread(()-> Earth.getInstance()).start();
        new Thread(()-> Earth.getInstance()).start();

    }
}
