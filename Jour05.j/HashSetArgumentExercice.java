import java.util.HashSet;

public class HashSetArgumentExercice {
    public static void main(String[] args) {
        // Créer un HashSet pour stocker les arguments de la ligne de commande
        HashSet<String> arguments = new HashSet<>();

        // Ajouter les arguments de la ligne de commande au HashSet
        for (String argument : args) {
            arguments.add(argument);
        }

        // Afficher les arguments
        System.out.println("Arguments passés via la ligne de commande (sans doublons) :");
        for (String argument : arguments) {
            System.out.println(argument);
        }
    }
}
