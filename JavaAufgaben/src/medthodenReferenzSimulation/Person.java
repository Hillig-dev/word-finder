package medthodenReferenzSimulation;

public class Person {

String name;  
double weight;// Attribut

//Konstruktor 

public Person(String name, double weight) { 
this.name = name;
this.weight = weight;
}

// Methode 
public String getName() {
    return name;
}

// Methode
public double getWeight() {
    return weight;
}
@Override
    public String toString() {
    return getClass().getSimpleName();
}
    
}