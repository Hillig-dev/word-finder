package synchronisierung1;

import java.util.Arrays;

public class MutableString {
    
    
    private char[] chars;

    private int nextFreeIndex;

    /*
     * Kontruktor wird ein String übergeben. Deren Zeichen werden in 
     * ein Char-Array abgespeichert. 
     * Die Zeichenlänge des String wird als nextFreeIndex gespeichert
     */
    public MutableString(String s) {
        chars = s.toCharArray();
        nextFreeIndex = s.length();
    }

    /* 
     * charAt Methode von String Klasse gibt die Char Zeichen der 
     * übergebenen Indexposition zurück.
     * append(char)
     */
    public MutableString append(String s) {
        for (int i = 0; i < s.length(); i++) {
            append(s.charAt(i));
        }
     
        return this;
    }
/*
 * Mit Hilfe der Methode copyOf der Klasse Arrays wird der Array
 *  char bei Bedarf in seiner Zeichenlänge verdoppelt.
 *  Der Parameter char c wird auf der ersten "freien" Position nach dem 
 *  bisherigen Array char eingefügt und der Positionsmerker nextFreeIndex
 *  um eins erhöht. 
 *  Dem das String repräsentierenden Array chars wird der Parameter char c
 *  am Ende hinzugefügt. Bei Bedarf wird dazu die Array-Länge verdoppelt.
 *  Durch die Erhöhung des nextFreeIndex um 1 ist für alle zukünftigen
 *  Aktionen vermerkt, wieviele Elemente des Arrays das mutableString 
 *  repräsentieren. 
 */
     
    private void append(char c) {
        if (chars.length == nextFreeIndex) {
            chars = Arrays.copyOf(chars, chars.length * 2);
        }
        chars[nextFreeIndex] = c;
      
        nextFreeIndex++;
    }

/*
 * length Methode gibt nextFreeIndex zurück
 */
    public int length() {
      
        return nextFreeIndex;
    }

    /*
     * Ein neues String-Objekt wird erzeugt, welches die Länge
     * des Arrays chars darstellt, die das mutable String repräsentiert. 
     * Dieses wird zurückgegeben. 
     */
    
    @Override
    public String toString() {
        return new String(Arrays.copyOfRange(chars, 0, nextFreeIndex));
    }
}