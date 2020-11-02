package beobachterEntwurfsMuster;

import java.time.LocalTime;
import java.util.ArrayList;

/*
 * Ereignisquellen-Klasse
 */

public class WakeUpService {

    // Attribute: 
    int wakeUpTime;
    ArrayList<WakeUpServiceClient> kundenListe = new ArrayList<WakeUpServiceClient>();
    
    // Konstruktor übergibt Weckzeit:
     WakeUpService(int wakeUpTime) {
        if (wakeUpTime > 23 || wakeUpTime <1) {
        return;   
        }
        else {
        this.wakeUpTime = wakeUpTime;
    }}
    
    void register(WakeUpServiceClient client) {
        kundenListe.add(client);
      
    }
    
    // Methode ruft wakeUp-Methode aller Beobachter auf:
    void wakeUpAllClients() {
        for (WakeUpServiceClient client : kundenListe) {
        client.wakeUp(wakeUpTime);
    }}
    
    public void startService() {
        boolean finished = false; 
        System.out.println("Weckdienst fuer Weckzeit " +
        
        wakeUpTime + ":00 Uhr gestartet."); 
        while (!finished) {
        int currentHour = LocalTime.now().getHour(); 
        if (currentHour == wakeUpTime) {
                wakeUpAllClients();
        finished = true; }
        try {
        Thread.sleep(1000); 
        // Eine Sekunde Pause
        } catch (InterruptedException e) { e.printStackTrace();
        } }}
    
    
}
