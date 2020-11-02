package synchronisierung1;

public class MutableStringTest {
    public static void main(String[] args) {
        Thread threadA = new Thread1();
        threadA.start();
        Thread threadB = new Thread1();
        threadB.start();
        
        Thread threadC = new Thread1();
        threadC.start();
        Thread threadD = new Thread1();
        threadD.start();
      
    }

}
