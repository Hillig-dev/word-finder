package awt1;

import java.awt.*;
import java.awt.event.*;

/* Beobachter Klasse implementiert WindowListener Interface. 
 * Einziges Ziel ist, dass beim Ereignis "button drücken" das Fenster und damit 
 * das Programm geschlossen wird. 
 */

public class FensterBeobachter implements WindowListener {

        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }

        // weitere Methoden des Interfaces: 
        @Override
        public void windowOpened(WindowEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void windowClosed(WindowEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void windowIconified(WindowEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void windowActivated(WindowEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            // TODO Auto-generated method stub
            
        }}