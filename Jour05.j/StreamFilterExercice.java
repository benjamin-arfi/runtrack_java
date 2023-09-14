import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExercice {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Veuillez fournir deux arguments : une valeur de filtrage et une liste de nombres.");
            return;
        }

        int valeurFiltrage = Integer.parseInt(args[0]);
        List<Integer> nombres = Arrays.stream(args)
                .skip(1)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // Utilisation de la Stream API pour filtrer les nombres
        List<Integer> nombresFiltres = nombres.stream()
                .filter(nombre -> nombre > valeurFiltrage)
                .collect(Collectors.toList());

        // Afficher les nombres filtrés
        System.out.println("Nombres supérieurs à " + valeurFiltrage + " : " + nombresFiltres);
    }
}