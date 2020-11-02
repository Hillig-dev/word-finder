package ss16;

public class Circle {
protected int radius01; 

public Circle(int radius) {
radius01 = radius; 
}

public double getArea() {
return Math.PI * radius01 * radius01;
} 
@Override
public boolean equals(Object o) {
    if (o instanceof Circle) {
        if ((Circle) o.radius01 equals(this.radius01) ) return true; 
    
    }}
}
/*
Schreiben Sie eine Klasse Ellipse, die die Klasse Circle erweitert und deren Instanzvariable radius01 als eine seiner zwei Halbachsen nutzt. Ergänzen Sie einen Konstruktor, der die Halbachsen initialisiert und überschreiben Sie die Methode getArea() in geeigneter Weise. (5 Punkte)
Hinweis: Die Fläche einer Ellipse ist das Produkt der Längen ihrer Halbachsen und 𝜋.
*/
