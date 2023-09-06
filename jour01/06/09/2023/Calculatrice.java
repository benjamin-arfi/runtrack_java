import java.util.Scanner;
public class Calculatrice {
    private int nombre1;
    private int nombre2;
    private int resultat;
    public Calculatrice(int nombre1, int nombre2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
    }

    public void add() {
        resultat = nombre1 + nombre2;
        System.out.println("La somme " + resultat);
    }

    public void substraction() {
        resultat = nombre1 - nombre2;
        System.out.println("Difference:" + resultat);
    }

    public void produit() {
        resultat = nombre1 * nombre2;
        System.out.println("Produit:" + resultat);
    }

    public void division() {
        resultat = nombre1 / nombre2;
        System.out.println("Division:" + resultat);
    }
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

            Calculatrice calcul = new Calculatrice(nombre1, nombre2);

            calcul.add();
            calcul.substraction();
            calcul.produit();
            calcul.division();
            
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
