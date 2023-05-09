import java.util.Scanner;

public class chiffre {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez un nombre entier : ");
            int nombre = scanner.nextInt();

            System.out.println("Les nombres entiers jusqu'à " + nombre + " sont :");

            for (int i = 1; i <= nombre; i++) {
                System.out.print(i + " ");
            }
        }
    }
}


