package stroeme;
import java.io.IOException;

/* Kopie aus Tutorial. 
 * Diese Klasse ist der eigentliche Reader von Strings. 
 * 
 */
public class StringLeser implements CharEingabeStrom {
    private String quelle;
    private int index;

    public StringLeser(String quelle) { this.quelle = quelle;
}
    
    @Override
    public int read() throws IOException {
if(index == quelle.length()) return -1;
return quelle.charAt(index++); }
}