import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExercice {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuillez fournir au moins un nom en argument.");
            return;
        }

        // Utilisation de la Stream API pour convertir les noms en majuscules
        List<String> nomsEnMajuscules = Arrays.stream(args)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Afficher les noms en majuscules
        System.out.println("Noms en majuscules : " + nomsEnMajuscules);
    }
}
