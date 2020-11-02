package client;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

public class MattisClient {
// Meine IP 95.208.248.81
    public static void main(String[] args) {
       MattisClient client = new MattisClient("localhost", 8000);
       client.sendMessage("Guten Tag Frau Server! Wie geht's? "); 
    }

    private InetSocketAddress address;
    
    public MattisClient(String hostname, int port) {
        address = new InetSocketAddress(hostname, port);
    }
    
    public void sendMessage(String msg) {
        // Client erzeugt seinen Socket und sucht nach Serversocket:

        try {
            System.out.println("CLIENT: Verbinde zu Server....");
            Socket socket = new Socket();
            socket.connect(address, 5000);
            System.out.println("CLIENT: Verbunden.");

            // Client schreibt eine Nachricht an Server
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            pw.println(msg);
            pw.flush();
            System.out.println("CLIENT: Nachricht gesendet");

            // Verbindung schließen
            pw.close();
            socket.close();
            System.out.println("CLIENT: Verbindung geschlossen" );
            
            } catch (Exception e) {
            e.printStackTrace();
        }
       }
}
