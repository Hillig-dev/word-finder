package stroeme;
import java.io.IOException;

public class Rot13Filter implements CharEingabeStrom {
    
    // Instanzvariable quelle vom IF-Typ wird deklariert:
    private CharEingabeStrom quelle;

    /*
     *  Konstruktor nimmt einen Parameter vom IF-Typ auf 
     *  und belegt damit quelle
     */
    
    public Rot13Filter(CharEingabeStrom quelle) {
        this.quelle = quelle;
    }

    // read() Methode 
    @Override
    public int read() throws IOException {
        
        int zeichen = quelle.read();
        if(zeichen == -1) return -1;
        /* der eingelesene int-Wert wird (wieder) in einen Char-Wert umkonvertiert.
         * Für die ersten 13 Großbuchstaben des Alphabets wird buchstabe um 13 Plätze
         *  nach vorne verschoben.
         *  Für die letzten 13 Großbuchstaben wird buchstabe um 13 Plätze zurück geschoben
         */
        char buchstabe = (char) zeichen;
        if (buchstabe >= 'A' && buchstabe <= 'M') buchstabe += 13;
        else if (buchstabe >= 'N' && buchstabe <= 'Z') buchstabe -= 13;
        return (int) buchstabe;
    }
}