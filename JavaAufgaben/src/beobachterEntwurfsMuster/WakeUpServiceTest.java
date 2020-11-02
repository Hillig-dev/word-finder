package beobachterEntwurfsMuster;

public class WakeUpServiceTest {

    public static void main(String[] args) {
        
        // Weckservice wird aufgerufen
        WakeUpService wakeUpService = new WakeUpService(22);
        
        // anonyme Klasse für jeden Weck-Kunden:
        WakeUpServiceClient lilly = new WakeUpServiceClient() {
            
            @Override
            public void wakeUp(int zeit) {
                System.out.println("Lilly wurde geweckt. Weckzeit:  " + zeit + " Uhr.");
            }
        };
        WakeUpServiceClient kurt = new WakeUpServiceClient() {
            
            @Override
            public void wakeUp(int zeit) {
                System.out.println("Kurt wurde geweckt. Weckzeit:  " + zeit + " Uhr.");
            }
        };
      
        
        
        wakeUpService.register(lilly);
        
        wakeUpService.startService();
    }
    
}
