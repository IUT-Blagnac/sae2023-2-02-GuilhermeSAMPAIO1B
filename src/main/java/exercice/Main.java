package exercice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //timer
        long startTime = System.nanoTime();
        System.out.println(Exercice.solution("Je teste avec ce fichier ExerciceTest qui sert à tester les exercices avec des tests",List.of('t', 'J', 'f', 'E', 'c', 'a'))
);      long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds  : " + timeElapsed/1000000);
        // output: [classer, texte, exemple, a, de]
    }
}
