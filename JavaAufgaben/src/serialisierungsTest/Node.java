package serialisierungsTest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
 * Eine Klasse, die ein Container für Node-Objekte ist. Sie bedient sich einer
 * ArrayList als Datenstruktur.
 * Node-Objekte bekommen über ihren Konstruktor je einen String zum Speichern zugewiesen
 * 
 * Jedes Node Objekt speichert ein String-Objekt. Außerdem erzeugt es ein ArrayList-Objekt, in dem es 
 * beliebig viele Node-Objektreferenzen speichern kann. 
 */

class Node implements Serializable {
    String value;
/* 
 * Attribut edgesTo referenziert auf ein ArrayList-Objekt mit Typparameter
 * Node. Das Attribut selber ist vom Supertyp List des ArrayList-Objekts
 */
    List<Node> edgesTo = new ArrayList<Node>();
 /*
  * Konstruktor bedarf eines Strings, womit die Instanzvariable value belegt wird
  */
    public Node(String value) {
        this.value = value;
    }

    // Methode bedient sich der ArrayList-methode add()
    void addEdgeTo(Node node) {
        edgesTo.add(node);
    }
}