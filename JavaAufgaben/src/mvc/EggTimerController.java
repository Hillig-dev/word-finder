package mvc;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import eggTimerModel.EggTimerCanvas;

public class EggTimerController {
   
     // Controller bekommt Zeit übergeben und erzeugt ein Model-Objekt.
    public EggTimerController(int totalTimeInSeconds) {
        EggTimerModel eggTimerModel = new EggTimerModel(totalTimeInSeconds);
     // Controller erzeugt sich ein eigenes Timer-Objekt: 
        EventBasedTimer eventBasedTimer = new EventBasedTimer();
     // Controller erzeugt sich ein Canvas-Objekt, dass das oben erzeugte Model verwendet.
        EggTimerCanvas1 view = new EggTimerCanvas1(eggTimerModel);
        // Setzen der Dimension von Canvas
        view.setPreferredSize(new Dimension(320, 320));
        
        // Darstellung: Frame:
        Frame frame = new Frame("Kurzzeitwecker");
        // Anmelden eines "anonymen" Listeners, der beim Schließen des 
        // Hauptfensters die Anwendung beendet.
        frame.addWindowListener(new WindowAdapter() { 
          @Override
        public void windowClosing(WindowEvent e) {
              System.exit(0);
          }} );
        // Einfügen des EggTimerCanvas im Zentralbereich des Hauptfensters.
        frame.add(view, BorderLayout.CENTER);
        // Dieser Aufruf sorgt dafür, dass der LayoutManager des Hauptfensters 
        // dessen Größe gemäß der Wunschgrößen der auf diesem angeordneten 
        // Komponenten berechnet. Hier müssen Sie nichts einfügen.
        frame.pack();

        // Positionieren des Fensters in der Bildschirmmitte 
        // (siehe Ad-hoc-Aufgabe 4 der KE5).
        frame.setLocationRelativeTo(null);
        // Sichtbarmachen des Fensters.
        frame.setVisible(true);
        
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
            // Jetzt Zeitanteil statt an Konsole an Canvas 
            while (eggTimerModel.getElapsedPart() <1 ) {
                   eggTimerModel.increaseElapsedTime();
                   
                   // das klappt nicht:
               view.repaint();
               // Test Konsolenausgabe:
               System.out.println("paint");
               };
            // alt: System.out.println(100* eggTimerModel.getElapsedPart()+"%");
            if (eggTimerModel.getElapsedPart() >= 1) {eventBasedTimer.stop();}
            }});
        // Konstruktor startet den Timer: 
        eventBasedTimer.start();
        } 
        
    }
    


