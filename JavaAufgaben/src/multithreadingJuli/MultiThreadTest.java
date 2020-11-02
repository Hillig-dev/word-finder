package multithreadingJuli;

public class MultiThreadTest {

    public static void main(String[] args) {
       MeinThread1 thread1 = new MeinThread1("eins");
       MeinThread1 thread2 = new MeinThread1("zwei");
       
       thread1.start();
       thread2.start();
    }

}
