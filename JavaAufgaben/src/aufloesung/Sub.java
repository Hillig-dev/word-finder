package aufloesung;

import java.util.ArrayList;
import java.util.List;

class Sub extends Super {
    void m(Lebewesen[] p1, List<?> p2) {
        System.out.println("M3");
    }

    void m(Tier[] p1, ArrayList<Kuh> p2) {
        System.out.println("M4");
    }

    void m(Kuh[] p1, List<? extends Tier> p2) {
        System.out.println("M5");
    }
}