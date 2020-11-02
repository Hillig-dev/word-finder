package multithreadingJuli;

public class MeinThread1 extends Thread {

    String name;
    
    MeinThread1(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.println("Start von Thread "+name);
        
       try {
        Thread.sleep(300);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
       System.out.println("Terminierung von Thread "+name);
    }
}
