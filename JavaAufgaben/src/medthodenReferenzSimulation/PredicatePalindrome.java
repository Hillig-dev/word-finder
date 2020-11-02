package medthodenReferenzSimulation;

public class PredicatePalindrome implements FilterPredicate<Person> {
        @Override
    public boolean isMatching(Person candidate) { 
            /* nicht erfolgreicher Versuch, den Filter selber zu basteln: 
             *  Palindrome: anna ana otto gnudung: erstes Zeichen = Letztes ... bis letztes Zeichen der ersten  Hälfte
             *  = erstes Zeichen der zweiten Hälfte. 
             *  getName().length() / 2
             */
            String name = candidate.getName() ;
            int length = name.length();
            
            for (int i = 0; i< (length / 2); i++) {
              if (name.charAt(i) != name.charAt(length+1 - i)) ;
             return false;
            }
            return true;
    } 
            }