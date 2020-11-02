package stroeme;
import java.io.IOException;

/* Kopie aus Tutorial. Basis Test für erste Teilaufgabe
 * 
 */

public class StromTest {
    
    public static void main(String[] args) throws IOException {

String str = args[0];
CharEingabeStrom cs;
cs = new StringLeser(str);
cs = new UmlautSzFilter(cs);
cs = new GrossBuchstabenFilter(cs);
cs = new Rot13Filter(cs);

int zeichen = -1;
while ((zeichen = cs.read()) != -1) {
System.out.print((char) zeichen); }
System.out.println(); }
}
