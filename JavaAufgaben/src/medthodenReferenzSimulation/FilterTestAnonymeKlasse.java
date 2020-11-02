package medthodenReferenzSimulation;

import java.util.ArrayList;
import java.util.List;

// Filter lange Nachnamen und Palindrome heraus
public class FilterTestAnonymeKlasse {
    public static void main(String[] args) {

ArrayList<Person> source = new ArrayList<Person>(); 
source.add(new Person("Joe", 77.0));
source.add(new Person("Bob", 90.2));
source.add(new Person("Jenny", 44.2)); 
source.add(new Person("Anna", 51.9)); 
source.add(new Person("Peter", 84.3));

// Filter: Nur Namen mit weniger als fünf Buchstaben: 
Filter<Person> personFilter = new Filter<Person>(source); 
FilterPredicate<Person> hasShortName = new PredicateShortName(); 
List<Person> result = personFilter.filter(hasShortName);
/* Ausdruck Zwischenergebnis: 
for (Person person : result) {
System.out.println(person.getName()); 
}
*/

/*
// Filter: Nur Personen unter 50Kg Gewicht: 
// Ich erstelle ein Filter-Objekt mit der zu filternden List als Parameter:
Filter<Person> personWeightFilter = new Filter<Person>(result); 
// Ich erzeuge ein Objekt meiner Predicate-Klasse und belege eine Variable mit IF Datentyp damit:
FilterPredicate<Person> isBelowFifty = new PredicateBelowFifty();
// Ich rufe die Methode filter() des Filterobjekts auf mit dem Prädikatobjekt als Parameter: 
List<Person> resultTwo = personWeightFilter.filter(isBelowFifty);
*/



// Filter: Nur Personen mit Namen ohne Palindrom: 
// 1. Filterklassen-Objekt: 
Filter<Person> palindromFilter = new Filter<Person>(result); 
// 2. Prädikatsklassen-Objekt: 
// Prädikatsklasse als anonyme lokale Klasse: 
FilterPredicate<Person> ohnePalindrom = new FilterPredicate<Person>() {
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
            };    
// 3. filter()-Methode aus Filterobjekt wird mit Prädikatsobjekt als Parameter aufgerufen, um damit eine List zu erzeugen:
List<Person> resultThree = palindromFilter.filter(ohnePalindrom);

for (Person person : resultThree) {
    System.out.println(person.getName() +person.getWeight());
}

    } }