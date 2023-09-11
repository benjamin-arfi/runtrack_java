package Jour03;

import java.util.ArrayList;
import java.util.List;

public class SommeNombresPairs {
    public static void main(String[] args) {
        // Créer une liste d'entiers
        List<Integer> listeNombres = new ArrayList<>();

        // Ajouter des nombres à la liste
        listeNombres.add(1);
        listeNombres.add(2);
        listeNombres.add(3);
        listeNombres.add(4);
        listeNombres.add(5);
        listeNombres.add(6);

        // Calculer la somme des nombres pairs
        int sommeNombresPairs = 0;
        for (int nombre : listeNombres) {
            if (nombre % 2 == 0) {
                sommeNombresPairs += nombre;
            }
        }

        // Afficher la somme des nombres pairs
        System.out.println("Liste des nombres : " + listeNombres);
        System.out.println("Somme des nombres pairs : " + sommeNombresPairs);
    }
}

