package worteEinesTextSortieren;

import java.util.Scanner; 

public class Calculator {

    /*
     * this program offers a calculator 
     */
    
    public void calculatorInterface () {
        System.in
    }
    
    
    public int calculator(int number1, int number2, int calc) {
        
        int result =0;
        
       switch (calc) {
       case 1: result = number1 + number2;
       break;
       case 2: result = number1 - number2;
       break;
       case 3: result = number1 * number2;
       break;
       case 4: result = number1 / number2;
       break;
       }
        
        
        
        return result;
    }
    
    
}
