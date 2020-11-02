package addiererSelbstaufgabe51;

import java.awt.TextField;
import java.awt.event.ActionEvent;

public class ButtonListener extends ActionListener() {
    
    @Override
       public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt("4") +Integer.parseInt("2");
        t3 = new TextField(Integer.toString(x) , 4) ;
        repaint();
        System.out.println("hallo");
        }};