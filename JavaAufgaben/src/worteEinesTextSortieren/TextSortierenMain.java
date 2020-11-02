package worteEinesTextSortieren;

import java.util.Arrays;
import java.util.regex.Pattern;

public class TextSortierenMain {

    public static void main(String[] args) {
        
        String text =" * Eine Eine Eine eine Wegberechnung kürzester Weg von von A nach Z) via Dijkstra-Algorithmus (dies baut auf einem Netzsystem auf, jede Kante hat eine Länge und jeder Knoten einen Namen - nutze für diese Grundstruktur OOP)";
       
        SatzZerlegenClass object1 = new SatzZerlegenClass();
        
        /* System.out.println(Arrays.toString(object1.textSortieren(text)));
        */
        System.out.println(object1.doppelEntfernen(text));
        // Test Print Zähler der Doppelungen
       
       
    }

}
