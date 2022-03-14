package peaksoft;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Box> box = new LinkedList<>();
        box.add(new Box<>("метод"));
        box.add(new Box<>(777));
        System.out.println(Box.method(box));

    }
}
 /*
         Ичинде Box деген объектти кайтарган статический generic метод болсун.*/