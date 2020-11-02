package eggTimerModel;



/*
 * Canvas gestaltet die Oberfläche des Fensters frame.
 * Speziell dessen Methode paint mit Hilfe eines Graphics Objekts.
 */
import java.awt.*;

public class EggTimerCanvas extends Canvas {

        private EggTimerModel eggTimerModel;
       
      
        public EggTimerCanvas(EggTimerModel egg) {
        this.eggTimerModel = egg;
        }
      
        @Override
        public void paint (Graphics g) {
                g.setColor(Color.red);
                g.fillOval(10, 10, 300, 300);
                g.setColor(Color.green);
                g.fillArc(10, 10, 300,300, 90, - 360* (int) eggTimerModel.getElapsedPart());
                setBackground(Color.black);
            } 
        
        
}

