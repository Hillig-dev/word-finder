package ss16;

public class TestCircleEllipse {
public static void main(String[] args) {

Ellipse e = new Ellipse(1, 2); 
System.out.println(e.getArea());

Circle c = e; 
System.out.println(c.getArea());

}


}
}