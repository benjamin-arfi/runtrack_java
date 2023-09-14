
import java.util.ArrayList;

public class ArrayListArgumentExercice {
    public static void main(String[] args) {
        // Créer une ArrayList pour stocker les arguments de la ligne de commande
        ArrayList<String> arguments = new ArrayList<>();

        // Ajouter les arguments de la ligne de commande à l'ArrayList
        for (String argument : args) {
            arguments.add(argument);
        }

        // Afficher les arguments
        System.out.println("Arguments passés via la ligne de commande :");
        for (String argument : arguments) {
            System.out.println(argument);
        }
    }
}
