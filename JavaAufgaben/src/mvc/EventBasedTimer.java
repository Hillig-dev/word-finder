package mvc;

import java.util.*;

/* bei der EA 5.3 vorgegebene Klasse: 
 * 
Instanzen der Klasse EventBasedTimer sind ereignisbasierte Timer: Man 
kann bei Ihnen mit der Methode addTickListener Objekte des Typs 
TickListener als Beobachter anmelden.Wenn der Timer gestartet wird, 
werden alle angemeldeten Beobachter im Sekundentakt durch Aufruf 
ihrer Methode tickPerfomed informiert, so lange der Timer läuft.
Der Timer kann mit der Methode start gestartet und mit der Methode stop 
beendet werden.
 */

public class EventBasedTimer {
    private Timer internalTimer = new Timer();

    private List<TickListener> listeners = new ArrayList<TickListener>();

    // Meldet einen TickListener beim Timer an.
    public void addTickListener(TickListener listener) {
        listeners.add(listener);
    }

    // Startet diesen Timer.
    public void start() {
        internalTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (TickListener tickListener : listeners) {
                    tickListener.tickPerformed();
                }
            }
        }, 1000, 1000);
    }

    // Stoppt diesen Timer.
    public void stop() {
        internalTimer.cancel();
    }
}
