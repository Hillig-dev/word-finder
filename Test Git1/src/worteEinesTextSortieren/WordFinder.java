package worteEinesTextSortieren;

public class WordFinder {

    
    /*
     * the program finds a word in a text, prints the index of the word within the text and 
     * prints the text with the searched word underlined
     * 
     */

public void wordFinder(String text, String word) {
    
    int index = text.indexOf(word);
    String underlinedWord = (char)27 + word;
    text = text.replaceFirst(word, underlinedWord);
    
    System.out.println("the searched word starts in the text at position "+ index+".");
    System.out.println(text);
   
}


}
