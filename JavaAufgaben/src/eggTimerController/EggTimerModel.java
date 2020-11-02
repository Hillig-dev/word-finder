package eggTimerController;

/*
 * Datenmodel: Bekommt Gesamtlaufzeit (Eieruhr),
 * Methode elapsedTimeInSeconds erhöht die vergangene Zeit
 * Methode getElapsedPart gibt Anteil der schon vergangenen Zeit zurück.
 */
public class EggTimerModel {
    // vorgesehene Laufzeit in Sekunden
    private int totalTimeInSeconds;

    // verstrichene Zeit in Sekunden
    private int elapsedTimeInSeconds;

    // erzeugt eine neue Instanz dieser Klasse für die angegebene Laufzeit
    public EggTimerModel(int totalTimeInSeconds) {
        this.totalTimeInSeconds = totalTimeInSeconds;
    }

    // liefert den Zeitanteil, der bereits verstrichen ist
    public double getElapsedPart() {
        return (double) elapsedTimeInSeconds / totalTimeInSeconds;
    }

    // erhöht die verstrichene Zeit um eine Sekunde
    public void increaseElapsedTime() {
        elapsedTimeInSeconds++;
    }
}
