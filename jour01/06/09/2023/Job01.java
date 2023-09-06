import java.util.Scanner;

public class Job01 {
    // cette classe permet d'ecrire bienvenue
    /*
     * cela affiche hello word
     * de plus 
     */
    public static void main(String[] args) {
        System.out.println("Java Hello World !");
        try (// Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in)) 
        {
            // Demander à l'utilisateur son nom et prénom
            System.out.print("Entrez votre nom : ");
            String nom = scanner.nextLine();
            System.out.println("Hello ,"+ nom + "!");
        }     
    }     
    
}
