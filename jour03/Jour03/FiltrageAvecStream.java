package Jour03;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FiltrageAvecStream {
    public static void main(String[] args) {
        // Créer une liste de mots
        List<String> mots = Arrays.asList("chat", "chien", "ami", "rat", "arbre", "cab", "arc");

        // Utiliser les streams pour effectuer le filtrage
        List<String> resultat = mots.stream()
                .filter(mot -> mot.startsWith("a")) // Filtrer les mots commençant par 'a'
                .filter(mot -> mot.length() == 3)    // Filtrer les mots de longueur 3
                .collect(Collectors.toList());       // Collecter le résultat dans une liste

        // Afficher le résultat
        System.out.println("Mots filtrés : " + resultat);
    }
}

