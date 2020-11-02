package kontoTestAdHoc61;

/* 
 * Einzahler ist die Thread-Subklasse. Ihre Methode run() ruft Methode der Kontoklasse auf. 
 * Start des thread geht über Aufruf der Methode start() des Einzahler-Objekt (in main() )
 */

class Einzahler extends Thread {
    private Konto konto;
    private int betrag;
    
public Einzahler(Konto konto, int betrag) { 
    this.konto = konto;
    this.betrag = betrag;
}

    @Override
    public void run() {
konto.einzahlen(betrag); }
}