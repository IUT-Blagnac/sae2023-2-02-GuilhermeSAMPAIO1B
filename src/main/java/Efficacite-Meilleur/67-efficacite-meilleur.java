package exercice;

import java.util.ArrayList;
import java.util.List;

public class Exercice {
	 public static List<String> solution(String str, List<Character> ordre) {
	        str = str.replaceAll("[^\\p{Alnum}]", " ");
	        
	        List<String> mots = new ArrayList<>();
	        StringBuilder mot = new StringBuilder();
	        
	        for (char c : str.toCharArray()) {
	            if (Character.isLetterOrDigit(c)) {
	                mot.append(c);
	            } else if (mot.length() > 0) {
	                mots.add(mot.toString());
	                mot.setLength(0);
	            }
	        }
	        
	        if (mot.length() > 0) {
	            mots.add(mot.toString());
	        }
	        
	        List<String> resultat = new ArrayList<>();
	        int[] ordreIndex = new int[256];
	        
	        for (int i = 0; i < ordre.size(); i++) {
	            ordreIndex[ordre.get(i)] = i;
	        }
	        
	        for (char lettre : ordre) {
	            for (int i = 0; i < mots.size(); i++) {
	                String motCourant = mots.get(i);
	                if (!motCourant.isEmpty() && motCourant.charAt(0) == lettre) {
	                    resultat.add(motCourant);
	                    mots.set(i, "");
	                }
	            }
	        }
	        
	        for (char lettre : ordre) {
	            for (int i = 0; i < mots.size(); i++) {
	                String motCourant = mots.get(i);
	                if (!motCourant.isEmpty() && ordreIndex[motCourant.charAt(0)] == ordreIndex[lettre]) {
	                    resultat.add(motCourant);
	                    mots.set(i, "");
	                }
	            }
	        }
	        
	        for (String motCourant : mots) {
	            if (!motCourant.isEmpty()) {
	                resultat.add(motCourant);
	            }
	        }
	        
	        return resultat;
	    }
}
