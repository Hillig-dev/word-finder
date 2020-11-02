package stroeme;
import java.io.*;

/*
 * Adapter Klasse implementiert das selbsterstellte Interface CharEingabeStrom, 
 * um kompatibel mit den Folgebausteinen zu sein. 
 * Konstruktor belegt die Variable quelle mit dem Parameter vom Typ InputStreamReader. 
 */

public class Adapter  implements CharEingabeStrom {
    
    private InputStreamReader quelle;

    public Adapter(InputStreamReader isr) throws IOException { 
        quelle = isr;
}
    @Override
    public int read() throws IOException {
return quelle.read(); 
    }}
