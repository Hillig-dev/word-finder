package eggTimerController;

public class EggTimeControllerTest {

    // Testklasse erzeugt ein EggTimerModel-Objekt mit der Angabe der Timer-Zeit.
    // Dieses wird dann bei der Erzeugung eines Controller-Objekts als dessen Parameter
    // übergeben
    
    public static void main(String[] args) {
        EggTimerModel eggTimerModel = new EggTimerModel(10);
        EggTimerController eggTimeController = new EggTimerController(eggTimerModel);
    }

}
