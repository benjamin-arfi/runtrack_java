import java.util.HashMap;

public class HashMapArgumentExercice {
    public static void main(String[] args) {
        // Assurez-vous qu'il y a un nombre pair d'arguments
        if (args.length % 2 != 0) {
            System.out.println("Le nombre d'arguments doit être pair (clé-valeur).");
            return;
        }

        // Créer une HashMap pour stocker les paires clé-valeur des arguments de la ligne de commande
        HashMap<String, String> arguments = new HashMap<>();

        // Ajouter les paires clé-valeur des arguments de la ligne de commande à la HashMap
        for (int i = 0; i < args.length; i += 2) {
            String cle = args[i];
            String valeur = args[i + 1];
            arguments.put(cle, valeur);
        }

        // Afficher les paires clé-valeur
        System.out.println("Paires clé-valeur passées via la ligne de commande :");
        for (String cle : arguments.keySet()) {
            String valeur = arguments.get(cle);
            System.out.println(cle + " : " + valeur);
        }
    }
}
