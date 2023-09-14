package Jour03;

import java.util.*;

public class EtudiantsMap {
    public static void main(String[] args) {
        // Créer une TreeMap pour stocker les étudiants (matricule en tant que clé)
        TreeMap<String, String> etudiantsMap = new TreeMap<>();

        // Ajouter des étudiants à la map
        etudiantsMap.put("12345", "Alice");
        etudiantsMap.put("56789", "Bob");
        etudiantsMap.put("23456", "Charlie");
        etudiantsMap.put("98765", "David");
        etudiantsMap.put("34567", "Eve");
        
        // Afficher les étudiants par ordre de matricule
        System.out.println("Étudiants par ordre de matricule :");
        for (Map.Entry<String, String> entry : etudiantsMap.entrySet()) {
            String matricule = entry.getKey();
            String nom = entry.getValue();
            System.out.println("Matricule : " + matricule + ", Nom : " + nom);
        }
    }
}

