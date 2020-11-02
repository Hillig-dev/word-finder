package addiererSelbstaufgabe51;

import java.awt.*; 
import java.awt.event.*;

/* Ein Addierer-Objekt baut ein Frame / Hauptfenster.
 * Dein Konstruktor erzeugt einen Button-Objekt und drei Textfelder-Objekte.
 * Diese werden durch die Methode add() zum Frame hinzugefügt. 
 * 
 */

class Addierer extends Frame {
    
    protected Button b1;
    protected TextField t1,t2,t3;
    
public Addierer() { setLayout(new FlowLayout()); setSize(300,100);
b1 = new Button("addiere"); 
t1 = new TextField("4",4); // Feld mit Namensanzeige 4 und Feldbreite 4 char-Längen
t2 = new TextField("2",4); // Feld mit Namensanzeige 2 und Feldbreite 4 char-Längen
t3 = new TextField(4); // Feld ohne Namensanzeige und Feldbreite 4 char-Längen

// t3.setEditable(false); 

b1.addActionListener(new ActionListener() {
    @Override
       public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt("4") +Integer.parseInt("2");
        t3 = new TextField(Integer.toString(x) , 4) ;
        repaint();
        System.out.println("hallo");
        }});


add(t1);
add(t2);
add(t3);
add(b1); }
}

