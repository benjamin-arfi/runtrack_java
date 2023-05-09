import java.util.Scanner;
public class somme {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez nombre 1 : ");
            String input = scanner.nextLine();
            // Convertir la chaîne de caractères en un entier
            int nombre1 = Integer.parseInt(input);

            System.out.print("Entrez nombre 2 : ");
            String ui = scanner.nextLine();
            // Convertir la chaîne de caractères en un entier
            int nombre2 = Integer.parseInt(ui);

            int resultat = nombre1+ nombre2;
            System.out.println("le resultat est : " + resultat);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
