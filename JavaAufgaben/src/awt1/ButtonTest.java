package awt1;

import java.awt.*;
import java.awt.event.*;

public class ButtonTest {
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