import java.util.Scanner;
public class heure {
        public static void main(String[] args) {
            try (// Créer un objet Scanner pour lire l'entrée de l'utilisateur
            Scanner scanner = new Scanner(System.in)) 
            {
                System.out.print("Entrez l'heure sous forme de minute : ");
                String input = scanner.nextLine();
                // Convertir la chaîne de caractères en un entier
                int minutes = Integer.parseInt(input);

                System.out.println("Le nombre de minutes est : " + minutes);

                int heures = minutes / 60;
                int minutesRestantes = minutes % 60;

                System.out.print(minutes + " minutes est equivalent " + heures +" heures " + minutesRestantes +" minutes");

            }
}
}
