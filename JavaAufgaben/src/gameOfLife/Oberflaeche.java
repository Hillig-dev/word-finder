package gameOfLife;

import java.awt.*;

/* 1. Konstruktur: 
 * Frame-Objekt bekommt eine Referenz auf ein Welt-Objekt, erzeugt eigenes Panel-Objekt. 
 * Dieses nutzt Welt Attribute für Grid-Größe und erstellt das Layout. 
 * Panel added neu erzeugtes Button-Objekt 
 * Frame added Panel-Objekt.
 * Frame wird aktiviert
 * 2. Methode aktualisieren: wird mit Koordinaten für jedes WEsen aufgerufen. 
 * WesenButton Objekt wird über panel Methode getComponent erzeugt? 
 * ButtonObjekt wird aktualisiert, repaint-Methode wird aufgerufen (von welchem Objekt??)
 */
class Oberflaeche extends BaseFrame {
    Welt dieWelt;
Panel p;
Oberflaeche(Welt dieWelt) {
this.dieWelt = dieWelt;
p = new Panel();
p.setLayout(new GridLayout(dieWelt.MXG, dieWelt.MXG)); for (int lPos = 0; lPos < dieWelt.MXG; lPos++) {
for (int b = 0; b < dieWelt.MXG; b++) { 
    p.add(new WesenButton(dieWelt, lPos, b));
} }
        add(p);
        setVisible(true);
    }
void aktualisieren(int lPos, int bPos) { 
    WesenButton wesenButton =(WesenButton) p.getComponent(lPos * dieWelt.MXG + bPos); 
    wesenButton.aktualisieren();
    repaint(); }
}