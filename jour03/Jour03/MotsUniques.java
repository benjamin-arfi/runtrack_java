package Jour03;

import java.util.*;

public class MotsUniques {
    public static void main(String[] args) {
        // Liste de mots donnée
        List<String> listeMots = Arrays.asList("chat", "chien", "chat", "oiseau", "oiseau", "poisson");

        // Utilisation d'un HashMap pour compter les occurrences de chaque mot
        Map<String, Integer> compteurMots = new HashMap<>();

        for (String mot : listeMots) {
            // Vérifie si le mot est déjà dans le compteur
            if (compteurMots.containsKey(mot)) {
                // Si oui, incrémente le compteur d'occurrences
                compteurMots.put(mot, compteurMots.get(mot) + 1);
            } else {
                // Si non, ajoute le mot au compteur avec une occurrence de 1
                compteurMots.put(mot, 1);
            }
        }

        // Afficher les mots qui apparaissent une seule fois
        System.out.println("Mots uniques :");
        for (Map.Entry<String, Integer> entry : compteurMots.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}

