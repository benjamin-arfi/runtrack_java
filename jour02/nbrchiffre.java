import java.util.Scanner;

public class nbrchiffre {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez un nombre : ");
            int numero = scanner.nextInt();
            int nbChiffres = 0;
            while (numero != 0) {
                numero /= 10;
                nbChiffres++;
            }
            System.out.println("Le nombre de chiffres dans ce nombre est : " + nbChiffres);
        }
    }
}
