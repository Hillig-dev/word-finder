package aufgabenNovember;

import java.util.ArrayList;
import java.util.List;

public class WortSuchen {

        public List<Integer> findeWort(String textString, String wort) {
            List<Integer> indexes = new ArrayList<Integer>();
            String lowerCaseTextString = textString.toLowerCase();
            String lowerCaseWort = wort.toLowerCase();

            int index = 0;
            while(index != -1){
                index = lowerCaseTextString.indexOf(lowerCaseWort, index);
                if (index != -1) {
                    indexes.add(index);
                    index++;
                }
            }
            return indexes;
        }
    }

