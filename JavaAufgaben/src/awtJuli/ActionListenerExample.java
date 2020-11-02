package awtJuli;

import java.awt.*;
import java.awt.event.*;

/*
 *  Event handler class: Damit auf ein Ereignis reagiert werden kann,
 *  muss eine WindowListener-Klasse geschrieben werden. 
 *  Alle IF Methoden müssen werden aufgelistet. Auch wenn sie nicht
 *  implementiert werden. 
 */

public class ActionListenerExample implements WindowListener  {

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
        
    }

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
        
    }
    
}
