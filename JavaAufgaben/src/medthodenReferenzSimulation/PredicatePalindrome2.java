package medthodenReferenzSimulation;

public class PredicatePalindrome2 implements FilterPredicate<Person> {
    @Override
public boolean isMatching(Person candidate) { 
        
        String name = candidate.getName();
        /*
         *  Wie in Ad hoc Aufgabe vorgeschlagen:
         *  Nutzung der StringBuilder Klasse: 
         *  Objekterzeugung >> Methode reverse() >> casten auf String
         */
        StringBuilder nameTemp = new StringBuilder(name); 
        StringBuilder nameTemp2 = nameTemp.reverse();
        String nameReverse = nameTemp2.toString();
       
        //Vergleich der beiden Strings mit equalsIgnoreCase Methode:
        if (nameReverse.equalsIgnoreCase(name)) {
            return false;
        }else return true;
        
}
        }