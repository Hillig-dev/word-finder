package medthodenReferenzSimulation;

public class PredicateBelowFifty implements FilterPredicate<Person> {
    @Override
public boolean isMatching(Person candidate) { 
        return candidate.getWeight() < 50.0;
} }