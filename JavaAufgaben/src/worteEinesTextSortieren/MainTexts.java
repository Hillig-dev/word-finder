package worteEinesTextSortieren;




public class MainTexts {

    public static void main(String[] args) {
        String text = "Indigo\n" + 
                "\n" + 
                "Indigo ist eine tief­blaue, kristalline orga­nisch-chemi­sche Verbin­dung. Indigo ist eines der ältes­ten und bekann­testen Pig­mente und wurde schon in prä­histori­scher Zeit zum Ein­färben von Texti­lien verwen­det. Früher wurde der Indigo aus pflanz­lichen Quellen wie den Blät­tern des Färber­waid oder aus der Indigo­pflanze gewon­nen. Ab 1865 führte Adolf von Baeyer eine Reihe von Studien durch, in denen er verschie­dene Syn­these­wege für Indigo ent­wickelte und seine chemi­sche Struk­tur be­stimm­te. Für seine Arbei­ten zur Farb­stoff­chemie erhielt er 1905 den Nobel­preis für Chemie. Heutzu­tage werden mehrere zehn­tausend Tonnen Indigo pro Jahr synthe­tisch produ­ziert, wobei er über­wiegend zum Färben von Denim-Baum­woll­stoffen für die Her­stel­lung von Blue Jeans verwen­det wird. – ";
       
        SplitTexts object1 = new SplitTexts();
        
        //System.out.println(java.util.Arrays.toString(object1.splitTexts(text)));
        
        System.out.println(java.util.Arrays.toString(object1.sortText(text)));
         
}}