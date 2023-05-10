import java.util.Scanner;

public class etoile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez la hauteur du triangle : ");
            int hauteur = scanner.nextInt();

            for (int i = 1; i <= hauteur; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
