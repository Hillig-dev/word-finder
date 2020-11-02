package kontoTestAdHoc61;

/* Es gibt wegen fehlender Synchronisation der beiden parallelen Thread Einzahler -Objekte A und B
 * drei mögliche Ergebnisse: 1. 7000 Euro, wenn keiner der beiden threads in seiner 
 * Ausführung unterbrochen wird. 2. 3000 Euro, wenn A unterbrochen wird und bei Wiederzulassung
 * Prozessor die zwischenzeitlich von B gemachte Neubelegung der Variable saldo ignoriert und 
 * und seine Einzahlung auf Grundlage des ursprünglichen Werts von saldo vornimmt. 
 * 2. Wenn B von A unterbrochen wird. 
 * 
 */

class KontoTest {
    public static void main(String[] args) throws InterruptedException {
Konto konto = new Konto(1000);
Thread A = new Einzahler(konto, 2000);
Thread B = new Einzahler(konto, 4000);
A.start();
B.start();
A.join(); // Main-Thread wartet auf Beendigung von A 
B.join(); // Main-Thread wartet auf Beendigung von B 
konto.printSaldo(); // Main-Thread gibt Kontostand aus
}}