package worteEinesTextSortieren;

import java.util.Arrays;

public class SatzZerlegenClass { 
    
   
    public String[] textAufteilen(String text) {
        
        /*
         * Ein Programm, welches Wörter eines eingefügten Textes in einen String Array aufspaltet
         */
        
        
        String[] textAufgeteilt = text.split(" ");
        for (int t=0; t<textAufgeteilt.length; t++) {
            String temp = textAufgeteilt[t];
            // Entfernen von Zeichen, die keine Wörter sind:
            /*textAufgeteilt[t] =temp.replace(".","");
            temp = textAufgeteilt[t];
            textAufgeteilt[t] =temp.replace(",","");
            temp = textAufgeteilt[t];
            textAufgeteilt[t] =temp.replace("?","");
            temp = textAufgeteilt[t];
            textAufgeteilt[t] =temp.replace("!","");
            temp = textAufgeteilt[t];
            textAufgeteilt[t] =temp.replace("(","");
            temp = textAufgeteilt[t];
            textAufgeteilt[t] =temp.replace(")","");  
            */
        }
        return textAufgeteilt;
    }
    
    public String[] textSortieren(String text){
            
        /*
         * Ein Programm, welches Elemente eines String Arrays alphabetisch sortiert 
         */
        
        String[] textZumSortieren = textAufteilen(text);
      
        int size = textZumSortieren.length;
        for(int i = 0; i<size-1; i++) { // i ist Position des ersten String array element
            for (int j = i+1; j<textZumSortieren.length;j++){ // j ist Position des zweiten String array element
            if(textZumSortieren[i].compareToIgnoreCase(textZumSortieren[j])>0) {
                String temp = textZumSortieren[i];
                textZumSortieren[i] = textZumSortieren[j]; 
                textZumSortieren[j] = temp;
                String[] textSortiert = textZumSortieren;
     }}}
        return textZumSortieren ;    
    }
    
    
public String doppelEntfernen(String text){
    
    /*
     * * Ein Programm, welches doppelte Wörter aus einem eingefügten Text entfernt
     * Text wird mit hilfe von textAufteilen() in Array gespeichert.
     * Anzahl doppelter Worte wird ermittelt für neue Arraylänge. 
     * Array Elemente werden in einen neuen Array kopiert, wobei Wort Doppelungen nicht kopiert werden. 
     */
   int doppelungen = 0;
    // text wird mit Methode textAufteilen in Worte aufgeteilt und in String Array gespeichert
    String[] textMitDoppel = textAufteilen(text);
    System.out.println(" Der Text mit Doppelungen hat " +( textMitDoppel.length) + " Wörter");
    
    // neuen Array deklarieren:
    String[] textOhneDoppel = null;
    // Zählen doppelter Worte
    for (int i=0 ; i<textMitDoppel.length-1;i++){ // j ist Position des zweiten String array element
        if(textMitDoppel[i].compareToIgnoreCase(textMitDoppel[i+1])== 0) {
            doppelungen++;
          }}
    
    System.out.println("Der Text hat " + doppelungen +" Wort-Doppelungen");
        // neuen Array initialisieren:
    textOhneDoppel = new String[textMitDoppel.length - doppelungen] ;
    System.out.println(" Der Text ohne Doppelungen hat " +( textMitDoppel.length - doppelungen) + " Wörter");
    
    // Kopieren des Arrays in einen kleineren Array ohne Doppelungen
   
    // Zähler für neuen Array:
    int k = 1;
    // erstes Element kann noch keine Doppelung sein:
    textOhneDoppel[0] = textMitDoppel[0];
    
    for (int j=1 ; j<textMitDoppel.length;j++){ 
        
        if (textMitDoppel[j-1].compareToIgnoreCase(textMitDoppel[j]) != 0) {
    textOhneDoppel[k] = textMitDoppel[j];
    k++;}
        
    }
        // String  Array zu einem String zusammenführen:
        //StringBuilder textString = new StringBuilder();// neues Objekt
        String textString = textOhneDoppel[0];
        for (int x=1; x<textOhneDoppel.length;x++ ) {
        textString = textString +" "+ textOhneDoppel[x];
        }
        
     return textString;
    }       
} 
    
