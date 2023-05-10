public class desCombinaison {
    public static void main(String[] args) {
        int count = 0; // compteur pour le nombre total de combinaisons

        // boucle triple pour générer toutes les combinaisons
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    System.out.println(i + " " + j + " " + k); // affichage de la combinaison
                    count++; // incrémenter le compteur
                }
            }
        }

        System.out.println("Nombre total de combinaisons : " + count);
    }
}

