package synchronisierung1;

public class MS {
    /* ein neues MutableString-Objekt wird erzeugt mit einem null String
     * Parameter,  ""
     */
    private MutableStringSync ms = new MutableStringSync("");

    /*
     * Methode: check, ob Parameter value nicht null ist und seine Länge >0. 
     * Checkt dann, ob der return der Methode length des MutableString-
     * Objekts (Länge des erweiterteten Strings) >0 ist. 
     * In dem Fall wird dem chars Array ein String "," als Element hinzugefügt. 
     * Dann wird dem chars Array der String Parameter name (in chars) angehängt. 
     */
    
    public void addProperty(String name, String value) {
        if (value != null && value.length() > 0) {
            if (ms.length() > 0) {
                ms.append(",");
            }
            ms.append(name).append("=").append(value);
        }
    }
    
    public String rueckgabe() {
        return ms.toString();
    }
}

