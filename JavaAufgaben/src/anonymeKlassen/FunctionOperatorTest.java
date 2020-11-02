package anonymeKlassen;

/*
 * Kursaufgabe 5.1.? zum Einbau von anonymen Klassen und danach zum Ersetzen durch LambdaAusdrücke
 */
public class FunctionOperatorTest {
    public static void main(String[] args) {
    FunctionOperator functionOperator = new FunctionOperator();
    
    IntIntFunction intIntFunction1 = new IntIntFunction() {
        @Override
        public int perform(int value) {
            return (value - 1);
        }}
    ;
    System.out.println("Ergebnis: " +functionOperator.operate(intIntFunction1, 10, -10));
    
    IntIntFunction intIntFunction2 = new IntIntFunction() {
        @Override
        public int perform(int value) {
            if (value%2 == 0) 
                {value = value/2;
                } else {value = value*3 +1;
                } return value;
                }};
       System.out.println("Ergebnis: " +functionOperator.operate(intIntFunction2, 27, 1));
         
       // Lambda-Ausdruck : 
      
       System.out.println("Ergebnis: " + functionOperator.operate( (value) -> ((value -1)), 10, -10));
       
       
    // Lambda-Ausdruck : 
       // ich verwende diesen Art von Ausdruck: x = x < 0 ? x * -1 : x;
       //  um diese if else Beziehung abzubilden: if {(value%2 == 0) {value = value/2;} else {value = value*3 +1;
       System.out.println("Ergebnis: " + functionOperator.operate( (value) -> value%2 == 0 ? value/2 : value*3+1 , 27, 1));
       
       
    }}
    

