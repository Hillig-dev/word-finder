package medthodenReferenzSimulation;

import java.util.ArrayList;
import java.util.List;


public class FilterTest {
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



// Filter: Nur Namen ohne Palindrom: 
Filter<Person> palindromFilter = new Filter<Person>(result); 


FilterPredicate<Person> ohnePalindrom = new PredicatePalindrome2();


List<Person> resultThree = palindromFilter.filter(ohnePalindrom);

for (Person person : resultThree) {
    System.out.println(person.getName() +person.getWeight());
}

    } }