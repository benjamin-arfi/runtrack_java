package Jour03;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TransformationsAvecStream {
    public static void main(String[] args) {
        // Créer une liste de nombres
        List<Integer> nombres = Arrays.asList(5, 12, 8, 15, 3, 20);

        // Utiliser les streams pour effectuer les transformations et le filtrage
        List<Integer> resultat = nombres.stream()
                .map(nombre -> nombre * 2)        // Doubler chaque nombre
                .filter(nombre -> nombre > 10)    // Filtrer les nombres supérieurs à 10
                .collect(Collectors.toList());    // Collecter le résultat dans une liste

        // Afficher le résultat
        System.out.println("Liste transformée et filtrée : " + resultat);
    }
}
