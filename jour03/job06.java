import java.util.Random;

public class job06 {
    public static void main(String[] args) {
        int[] tableau = new int[10];
        Random rand = new Random();

        // Remplir le tableau avec des nombres aléatoires
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = rand.nextInt(100);
        }

        // Afficher le tableau
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
    }
}
