package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MattisServer {

    public static void main(String[] args) {
        MattisServer server = new MattisServer(8000);
        server.startListening();
    }
    
// port Nummer wird bei Objekterzeugung übergeben
    private int port;
    
    public MattisServer(int port) {
        this.port = port;
    }
    // Server Socket als Extra-Thread initialisiert. INnerhalb  der Methode startListening:
    public void startListening() {
        /*
         * anonyme Objekterzeugungen mit 2 anonymen Klassen und Aufruf der Methode start() in einem: 
         */
        new Thread(new Runnable() {
            
            @Override
            public void run() {
                
                while (true) {
                try {
                System.out.println("SERVER: Server starten");
                ServerSocket serverSocket = new ServerSocket(port);
                System.out.println("SERVER: Server wartet auf Verbindung");
                Socket clientSocket = serverSocket.accept();
                System.out.println("SERVER: Client verbunden" + clientSocket.getRemoteSocketAddress());
                
                Scanner s = new Scanner(
                        new BufferedReader(new InputStreamReader(clientSocket.getInputStream())));
                
                if(s.hasNextLine()) {
                    System.out.println("SERVER Neue Nachricht vom Client: " + s.nextLine());
                }
                
                // Verbindung schließen
                s.close();
                clientSocket.close();
                serverSocket.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
            }
            }
           
         }).start();
    }
    }
    

