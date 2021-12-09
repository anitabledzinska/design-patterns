package designpatterns.structural.proxy;

import java.util.Arrays;
import java.util.List;

public class GoogleMapsRouteFinderImpl implements RouteFinder {
    @Override
    public List<String> findRoute(String origin, String destination) {
        System.out.println("Pytamy serwis google'owy o trasę z " + origin + " do" + destination);
        return Arrays.asList("Wyrusz z " + origin,
                "Skręć w prawo, jedź 5km prosto",
                "Na rondzie drugi zjazd",
                "Dotarłeś do " + destination);
    }
}
