package mvc;
/*
 * Interface welches den ausführenden Klassen die Methodensignatur vorgibt.
 * Methodenimplementierung entscheidet dann über die Art der Reaktion 
 * auf das Ereignis
 */

public interface TickListener {
    void tickPerformed();
}


