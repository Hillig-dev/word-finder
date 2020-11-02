package synchronisierung1;

public class Thread2 extends Thread {
    
    public void run() {
        
        MutableStringSync mutableString = new MutableStringSync("Kartoffel");
        mutableString.append("salat");
        System.out.println(mutableString.toString());
    }}


