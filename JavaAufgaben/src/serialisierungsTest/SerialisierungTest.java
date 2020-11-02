package serialisierungsTest;

import java.io.*;


public class SerialisierungTest implements  java.io.Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
         * Es werden acht Node-Objekte mit je einem String als Parameter
         * erzeugt und Objektreferenzen mit ihnen belegt. 
         */
        
        Node root = new Node("root");
        Node n1 = new Node("1");
        Node n2 = new Node("2");
        Node n3 = new Node("3");
        Node n4 = new Node("4");
        Node n5 = new Node("5");
        Node n6 = new Node("6");
        Node n7 = new Node("7");

        // Node-Objekt root werden andere Node-Objekte zum speichern übergeben
        root.addEdgeTo(n7);
        root.addEdgeTo(n2);
        n2.addEdgeTo(n3);
        n3.addEdgeTo(n4);
        n4.addEdgeTo(n5);
        n5.addEdgeTo(n3);
        n3.addEdgeTo(n6);
        n1.addEdgeTo(n7);
        n7.addEdgeTo(n1);
        n6.addEdgeTo(n1);

        /*1*/
        /*
         *  FileOutputStream, kombiniert mit ObjectOutputStream schreibt 2 Objekte in Datei "foo"
         */
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("foo"));
        oos.writeObject(n2);
        oos.writeObject(n7);
        oos.close();
        
        /*
         *   FileInputStream, kombiniert mit ObjectInputStream liest aus Datei "foo".
         *   Der Objektreferenz root wird ein neu erzeugtes Node Objekt übergeben mit String "root" als 
         *   Parameter. 
         *   Zwei Mal wird auf root dessen Methode addEdgeTo() aufgerufen, jeweils mit Parameter
         *    ( (Node) ois.readObject() )
         *    Parameter-Bedeutung: aus dem ois Objekt wird die Methode readObject() aufgerufen und zu einem 
         *    Node-Datentyp gecastet.
         */
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("foo"));
        root = new Node("root");
        root.addEdgeTo((Node) ois.readObject());
        root.addEdgeTo((Node) ois.readObject());
        ois.close();
        
      
        /*2*/
    }
}

