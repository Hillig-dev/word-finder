package awt1;

import java.awt.*;
import java.awt.event.*;
/*
 * Allgemein: 
 * Frame Klasse zur Beschreibung des Frames (Komponente).
 * Die nötige Beobachter / Listener-Klasse ist nun eine lokale und anoyme Klasse
 * innerhalb der Listenerklasse. 
 * Die gesamte Ereignissteuerung erfolgt nun in einem Ausdruck: 
 * Methode addWindowListener erzeugt die Beobachterklasse im Parameter 
 * und meldet sie an. 
 * Frame-Klasse wird in main instanziiert und mit setVisible-Methode
 * aktiviert (?)
 * */
public class BaseFrameAnonym extends Frame {

    // Konstruktor der Frame-Klasse implementiert die Methode
    // addWindowListener 
    public BaseFrameAnonym() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
        
        setSize(300, 400);
        setLocationRelativeTo(null);
        
    
 }}