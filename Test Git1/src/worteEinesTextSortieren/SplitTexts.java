package worteEinesTextSortieren;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class SplitTexts { 
    
   
    public String[] splitTexts(String text) {
        
        /*
         * the method split Strings into a String Array of single words, 
         * thereby deleting the special characters of the sentence grammar  
         */
        
        // deleting special symbols from text
        text = text.replace(".","");
        text = text.replace(",","");
        text = text.replace("?","");
        text = text.replace("!","");
        text = text.replace("(","");
        text = text.replace(")","");
        text = text.replace("*","");
        text = text.replace(",","");
        text = text.replace("-","");
        text = text.replace("#","");
        text = text.replace("/","");
        text = text.replace("–","");  
        
        // splitting up the text by spaces into words
        String[] splittedText = text.split(" ");
        return splittedText;    
        }
       
  
    
    public String[] sortText(String text){
            
        /*
         * the method returns each word of a text - sorted in alphabetical order - as elements of a  
         * String array 
         */
        
   
        
        String[] textToSort = splitTexts(text);
      
       Arrays.sort(textToSort, Collator.getInstance(Locale.GERMANY));
       
        return textToSort ;    
    }
} 
    
