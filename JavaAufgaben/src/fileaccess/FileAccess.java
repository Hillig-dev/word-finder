package fileaccess;

import java.io.*;

class FileAccess {
    
    public static void writeTextToFile(String fileName, String text)
throws IOException {
FileWriter fw = new FileWriter(fileName); 
BufferedWriter bw = new BufferedWriter(fw);
bw.write(text);
bw.close();

}
    public static void readTextFromFile(String fileName) throws IOException {
FileInputStream fis = new FileInputStream(fileName); 
InputStreamReader isr = new InputStreamReader(fis); 
BufferedReader br = new BufferedReader(isr);
String line = null;
while ((line = br.readLine()) != null) { 
    System.out.println(line);
}
br.close(); }
}