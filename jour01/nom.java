
import java.util.Scanner;

public class nom {
    public static void main(String[] args) {
        try (// Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in)) 
        {
            // Demander à l'utilisateur son nom et prénom
            System.out.print("Entrez votre nom : ");
            String nom = scanner.nextLine();
            System.out.print("Entrez votre prénom : ");
            String prenom = scanner.nextLine();
            
            // Concaténer le prénom et le nom, puis afficher le résultat
            String nomComplet = prenom + " " + nom;
            System.out.println("Votre nom complet est : " + nomComplet);
        }
    }
}


