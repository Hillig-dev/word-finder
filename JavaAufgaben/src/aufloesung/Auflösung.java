package aufloesung;

import java.util.*;

public class Auflösung {
     public static void main(String[] args) {
         Super s1 = new Sub();
         Sub s2 = new Sub();
         List<Kuh> kuhList = new ArrayList<Kuh>();
         List<Tier> tierList = null;
         Tier[] tierArray = new Kuh[2];
         Kuh[] kuhArray = new Kuh[5];

       s1.m(tierArray, tierList); // Aufruf A1  M1
      s1.m(kuhArray, kuhList);   // Aufruf A2  M5
        
     s2.m(tierArray, tierList); // Aufruf A5 M1
      s2.m(kuhArray, kuhList);   // Aufruf A6  M5
        s2.m(tierArray, kuhList);  // Aufruf A7  M3
     }
}









