package awtJuli;

import java.awt.Frame;

/*
 * Wie alle Komponenten besitzt ein Hauptfenster 
 * 1 eine Größe, 2 eine Positi- on und 3 ein Attribut, in dem
 * vermerkt ist, ob die Komponente auf dem Bildschirm angezeigt 
 * werden soll oder nicht. 
 */
public class FrameTest {
    public static void main(String[] args) {
        Frame f = new Frame(); 
        f.setSize(300, 400); 
        f.setLocation(100, 100); 
        f.setVisible(true);
} }