import java.util.Scanner;

public class chaine {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String tmp;
            System.out.print("Entrez la première chaîne : ");
            String chaine1 = scanner.nextLine();

            System.out.print("Entrez la deuxième chaîne : ");
            String chaine2 = scanner.nextLine();

            System.out.println("La première chaîne est maintenant : " + chaine1);
            System.out.println("La deuxième chaîne est maintenant : " + chaine2);
            
            // Échanger les valeurs de chaine1 et chaine2
            tmp = chaine1;
            chaine1 = chaine2;
            chaine2 = tmp;

            // Afficher les nouvelles valeurs de chaine1 et chaine2
            System.out.println("La première chaîne est maintenant : " + chaine1);
            System.out.println("La deuxième chaîne est maintenant : " + chaine2);
        }
    }
}


