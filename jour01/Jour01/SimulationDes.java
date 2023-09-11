import java.util.Random;

public class SimulationDes {
    public static void main(String[] args) {
        Random random = new Random();

        // Lancer le premier dé
        int de1 = random.nextInt(6) + 1; // Un dé à 6 faces
        System.out.println("Résultat du premier dé : " + de1);

        // Lancer le deuxième dé
        int de2 = random.nextInt(6) + 1;
        System.out.println("Résultat du deuxième dé : " + de2);

        // Calculer la somme des résultats
        int somme = de1 + de2;
        System.out.println("Somme des résultats : " + somme);
    }
}
