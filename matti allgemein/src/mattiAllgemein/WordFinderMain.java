package mattiAllgemein;

public class WordFinderMain {

    public static void main(String[] args) {
        System.out.println("*** START ***");
        WordFinder finderobject = new WordFinder();
        finderobject.wordFinder(args[0],  args[1]);
    }

}
