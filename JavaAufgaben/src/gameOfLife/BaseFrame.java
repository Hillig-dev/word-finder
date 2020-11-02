package gameOfLife;

import java.awt.*;
import java.awt.event.*;
/*
 * Nun wird das Fenster in einer von Frame erbenden Klasse direkt eingerichtet. 
 * main() muss dann diese Klasse instanziieren. 
 * Beobachterklasse wird nun als lokale Klasse im Konstruktor deklariert (von WindowAdapter 
 * erbend)
 */
public class BaseFrame extends Frame {

    BaseFrame() {
        class ClosingBeobachter extends WindowAdapter {
         
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }
        setSize(300, 400);
        setLocationRelativeTo(null);
        addWindowListener(new ClosingBeobachter());
        setVisible(true);
    
} }