package synchronisierung1;

public class Thread1 extends Thread {
public void run() {
    MutableStringSync mutableString = new MutableStringSync("Kartoffel");
    mutableString.append("salat");
    System.out.println(mutableString.toString());
}}