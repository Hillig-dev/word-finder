package addiererSelbstaufgabe51;

import java.awt.event.*;

/* Die Main-Methode erzeugt ein Addierer-Objekt. 
 * Diesem wird ein Objekt vom Typ WindowAdapter als Listener hinzugefügt. 
 * Das WindowAdapter-Objekt beendet bei Schließen des Hauptfensters das 
 * Programm. 
 * Das Fram-Objekt wird aktiviert. 
 */

class AddiererTest {
    public static void main(String[] argv) {
Addierer f = new Addierer();
f.addWindowListener(new WindowAdapter () {
public void windowClosing (WindowEvent e) { System.exit(0);
}
});
f.setVisible(true); }
}