package aufloesung;

import java.util.List;

class Super {
    
    void m(Tier[] p1, List<Tier> p2) {
        System.out.println("M1");
    }
    
    void m(Kuh[] p1, List<? extends Tier> p2) {
        System.out.println("M2");
    }
}
