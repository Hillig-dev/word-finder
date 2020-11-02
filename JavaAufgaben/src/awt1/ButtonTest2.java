package awt1;

import java.awt.*;
import java.awt.event.*;

/*
 * Schreiben Sie dazu einen flexibel einsetzbaren separaten 
 * „Baustein“, den man bei beliebigen Quellen für die Ereignisse 
 * windowClosing und actionPerformed anmelden kann:
 * Es muss eine Beobachter-Klasse sein, deren Objekt angemeldet
 * wird. Ihre Methode ... hat "System.exit(0);" zum Inhalt. 
        
 */

public class ButtonTest2 {
    public static void main(String[] args) {
        // Frame durch Instanziierung der BaseFrame-Klasse
        Frame f = new BaseFrameAnonym();
        f.setLayout(new FlowLayout());
        
        Button exitButton = new Button("Programm beenden"); 
        exitButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) { System.exit(0);
        } });
        
        f.add(exitButton);
        f.setVisible(true); }
        }