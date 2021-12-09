package designpatterns.behavioral;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Iterable <String> stringList = Arrays.asList("aaa", "bbb", "ccc");
        Iterator<String> iterator = stringList.iterator();
        while(iterator.hasNext()) {
            String nextElement = iterator.next();
            System.out.println(nextElement);
        }
    }
}
