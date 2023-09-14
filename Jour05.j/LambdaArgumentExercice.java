
public class LambdaArgumentExercice {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Veuillez fournir deux arguments : une chaîne et une longueur minimale.");
            return;
        }

        String chaine = args[0];
        int longueurMinimale = Integer.parseInt(args[1]);

        // Utilisation de l'expression lambda pour effectuer la vérification
        CheckLongueur check = (s, len) -> s.length() > len;

        // Vérifier si la chaîne a une longueur supérieure à longueurMinimale
        boolean resultat = check.test(chaine, longueurMinimale);

        // Afficher le résultat
        if (resultat) {
            System.out.println("La chaîne '" + chaine + "' a une longueur supérieure à " + longueurMinimale);
        } else {
            System.out.println("La chaîne '" + chaine + "' n'a pas une longueur supérieure à " + longueurMinimale);
        }
    }

    // Interface fonctionnelle pour la vérification de la longueur
    interface CheckLongueur {
        boolean test(String chaine, int longueurMinimale);
    }
}

