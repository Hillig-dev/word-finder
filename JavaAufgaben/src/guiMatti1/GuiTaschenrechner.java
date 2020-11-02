package guiMatti1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GuiTaschenrechner extends JFrame {

    

    private JLabel labelOperand1; 
    private JLabel labelOperand2; 
    private JLabel labelOperator; 
    
    private JTextField fieldOperand1;
    private JTextField fieldOperand2;
    
    private JButton button;
    private String operator;
    
    public GuiTaschenrechner(String titel, String operator) {
       
        this.operator = operator;
        
        setTitle(titel);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLayout(new FlowLayout());
        
        setSize(250, 125);
        setResizable(false);
        
        initComponents();
        
        this.add(labelOperand1);
        this.add(labelOperand2);
        this.add(fieldOperand1);
        this.add(labelOperator);
        this.add(fieldOperand2);
        this.add(button);
        
        this.repaint();
        
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    private void initComponents() {
    labelOperand1 = new JLabel("Operand1:");
    labelOperand2 = new JLabel("Operand2:          ");
    labelOperator = new JLabel(operator);
    
    fieldOperand1 = new JTextField(8);
    fieldOperand2 = new JTextField(8);
    
    button = new JButton("Rechnen");
    button.addActionListener(new ActionListener() {
        

        @Override
        public void actionPerformed(ActionEvent e) {
           
            int ergebnis = fieldOperand1 + fieldOperand2;
            System.out.println("")
        }
    });
   
    } 
}



