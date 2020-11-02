package mvc;

import java.awt.Graphics.*;

/*
 * Canvas gestaltet die Oberfläche des Fensters frame.
 * Speziell dessen Methode paint mit Hilfe eines Graphics Objekt.
 */
import java.awt.*;
public class EggTimerCanvas1 extends Canvas {

        private EggTimerModel eggTimerModel;
       
        
        public EggTimerCanvas1(EggTimerModel eggTimerModel) {
        this.eggTimerModel = eggTimerModel;
        }
       
        
        // Methode paint von Canvas arbeitet mit Graphics-Objekt: 
        @Override
        public void paint (Graphics g) {
                g.setColor(Color.red);
                g.fillOval(10, 10, 300, 300);
                g.setColor(Color.green);
                g.fillArc(10, 10, 300,300, 90, - 360* (int) eggTimerModel.getElapsedPart());
                  setBackground(Color.black);
            } 
        
        
}


