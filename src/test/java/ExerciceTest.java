import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import exercice.Exercice;

import java.util.*;

public class ExerciceTest {

    @Test
    public void testSolution() {
        // Chaine simple avec ordre complet
        assertEquals(List.of("666","the", "the", "number", "of", "beast"), Exercice.solution("666, the number of the beast",List.of('6', 't', 'n', 'o', 'b')));
        // Chaine à 1 mot
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), Exercice.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
        // Chaine vide
        assertEquals(List.of(""), Exercice.solution("",List.of('6', 't', 'n', 'o', 'b')));
        // Chaine donnée en exemple
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), Exercice.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
        // Ajoutez vos test ici...
        assertEquals(List.of("teste", "Je", "fichier", "ExerciceTest", "ce", "avec"), Exercice.solution("Je teste avec ce fichier ExerciceTest",List.of('t', 'J', 'f', 'E', 'c', 'a')));
        assertEquals(List.of("teste", "tester", "tests", "Je", "fichier", "ExerciceTest", "ce", "avec", "a", "avec", "qui", "sert", "les", "exercices", "des" ), Exercice.solution("Je teste avec ce fichier ExerciceTest qui sert a tester les exercices avec des tests",List.of('t', 'J', 'f', 'E', 'c', 'a')));
    }
}