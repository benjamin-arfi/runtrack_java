import java.util.Scanner;

public class chiffrep {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez un nombre : ");
            int nombre = scanner.nextInt();

            int dernierChiffre = nombre % 10; // le dernier chiffre du nombre
            int premierChiffre = nombre; // le premier chiffre sera stocké dans cette variable

            while (premierChiffre >= 10) {
                premierChiffre /= 10; // divise le nombre par 10 jusqu'à obtenir le premier chiffre
            }

            System.out.println("Le premier chiffre est : " + premierChiffre);
            System.out.println("Le dernier chiffre est : " + dernierChiffre);
        }
    }
}
