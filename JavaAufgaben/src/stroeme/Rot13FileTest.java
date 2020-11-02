package stroeme;

import java.io.*;

public class Rot13FileTest {
    public static void main(String[] args) throws IOException {
       
        // Schreibt byte Daten in eine Datei: 
        FileOutputStream fos = new FileOutputStream("testout.txt");
       
        /*
         *  Verbindung char und byte: 
         *  codiert char als bytes mit einem speziellen charset.
         *  "OutputStreamWriter provides character encoding flexibility"
         *  "OutputStreamWriter needs to work with a FileOutputStream object in order to 
         *  do its job. "
         *  "OutputStreamWriter ist die Basisklasse für die konkrete Klasse FileWriter und 
         *  ist für die Konvertierung der Zeichen in Bytefolgen verantwortlich. Die 
         *  Konstruktoren bauen ein FileOutputStream-Objekt auf und füttern damit den
         *   Konstruktor von OutputStreamWriter. Die write()-Methoden vom 
         *   OutputStreamWriter konvertieren die Zeichen in Bytes, die letztendlich der 
         *   FileOutputStream schreibt"
         */
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        
        /*
         * Liest byte Daten (xcel, bilder) 
         * "FileInputStream reads bytes from a file."
         */
        FileInputStream fis = new FileInputStream("testin.txt");
        
        /*
         *  Brücke von byte zu char: decodiert bytes zu char. 
         *  Nennt charset: 
         */
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
       
        // Adapter muss IF CharEingabeStrom implementieren und ...
        Adapter adapter = new Adapter(isr);
        
        
        CharEingabeStrom cs = new UmlautSzFilter(adapter);
        cs = new GrossBuchstabenFilter(cs);
        //cs = new Rot13Filter(cs);
       
        int zeichen = -1;
        
        while ((zeichen = cs.read()) != -1) {
            osw.write(zeichen);
        }
        // InputStreamReader wird geschlossen
        isr.close();
        // OutputStreamWriter wird geschlossen:
        osw.close();
    }
}
