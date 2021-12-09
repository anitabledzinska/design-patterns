package designpatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        GoogleMapsRouteFinderImpl googleMapsRouteFinder = new GoogleMapsRouteFinderImpl();
//        System.out.println(googleMapsRouteFinder.findRoute("Katowice", "Warszawa"));
        CachedRouteFinder cachedRouteFinder = new CachedRouteFinder(googleMapsRouteFinder);
        System.out.println(cachedRouteFinder.findRoute("Katowice", "Warszawa"));
        System.out.println(cachedRouteFinder.findRoute("Katowice", "Warszawa"));
    }
}
