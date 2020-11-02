package eggTimerController;

public class EggTimerController {

    EggTimerModel eggTimerModel;
   
    // Konstruktor: Der Instanz wird ein Model-Objekt übergeben:
    public EggTimerController(EggTimerModel eggTimerModel) {
        this.eggTimerModel = eggTimerModel;
        // Konstruktor erzeugt sich ein eigenes Timer-Objekt: 
        EventBasedTimer eventBasedTimer = new EventBasedTimer();
        /* Konstruktor meldet ein anonymes TickListener-Objekt bei seinem Timer-Objekt an. 
        * Dieses implementiert die Interface-Methode tickPerformed() wie folgt: 
        * die Methode increaseElapsedTime() seines Model-Objekts wird aufgerufen,
        * der Timer-Fortschritt wird auf der Konsole ausgegeben,
        * die Methode stop() seines Timer-Objekts wird aufgerufen, falls der Anteil den Wert 1 erreicht. 
        */
        eventBasedTimer.addTickListener(new TickListener() {
            @Override
            public void tickPerformed() {
            eggTimerModel.increaseElapsedTime();
            System.out.println(100* eggTimerModel.getElapsedPart()+"%");
            if (eggTimerModel.getElapsedPart() >= 1) {eventBasedTimer.stop();}
            }});
        // Konstruktor startet den Timer: 
        eventBasedTimer.start();
        } 
        
    }
    


