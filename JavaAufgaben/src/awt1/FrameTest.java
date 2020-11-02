package awt1;

import java.awt.*;
import java.awt.event.*;

public class FrameTest {
    public static void main(String[] args) {
            // Frame Erzeugung:
        Frame f = new Frame("ActionListenerExample"); 
            f.setSize(100, 400); 
            f.setLocationRelativeTo(null);
           
            /* Gleichzeitiges Erzeugen eines Beobachter-Objekts und 
             * Anmeldung desselben bei der Ereignisquelle
            */
         FensterBeobachter beobachterObjekt = new FensterBeobachter();
         f.addWindowListener(beobachterObjekt); 
            // f.addWindowListener(new FensterBeobachter());
               
            f.setVisible(true);
            
          
            
            
        
           
           
           
} }