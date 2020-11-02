package ss16;

public class Ellipse extends Circle {

    protected int radius01;
    protected int radius02;
    
    public Ellipse(int radius, int radius02) {
        super(radius);
        this.radius02 = radius02;
    }
    
    public double getArea() {
        return Math.PI * radius01 * radius02;
    }
}

/*
TestCircleEllipse gibt aus:

6,28 (1*2*3,14)
3,14 (1*1*3,14)

e.getArea() ruft die Methode getArea() der Klasse Elipse auf.
c.getArea() ruft die Methode getArea() der SuperKlasse Circle von Elipse  auf.
Der Aufruf ist ein Beispiel für die dynamische Bindung während der Laufzeit:
Circle c = e bedeutet, dass c auf e zeigt. Aber die Objektvariable c ist nun vom Typ Circle, also dem Supertyp von e.
*/