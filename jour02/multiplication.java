import java.util.Scanner;
public class multiplication {
    
    public static void main(String[] args)  {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Entrez le chiffre : ");
                    String input = scanner.nextLine();
                    // Convertir la chaîne de caractères en un entier
                    int chiffre = Integer.parseInt(input);
                    for (int i=0 ; i <= 10; i++) {
                        int resultat = chiffre *i;
                        System.out.println(i+"x"+chiffre+"="+resultat);
                    }
    } catch (NumberFormatException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    }
}
