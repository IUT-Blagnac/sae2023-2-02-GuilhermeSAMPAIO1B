package exercice;

import java.util.*;

public class exercice {

    public static List<String> solution(String t, List<Character> o) {
        List<String> m = new ArrayList<>();
        String[] mt = t.split(" ");

        for (char l : o) {
            for (String w : mt) {
                if (w.charAt(0) == l) {
                    m.add(w);
                }
            }
        }

        return m;
    }
}