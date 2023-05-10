import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez votre âge : ");
            int age = scanner.nextInt();

            if (age < 16) {
                System.out.println("Désolé, vous êtes trop jeune pour travailler.");
            } else if (age >= 16 && age < 55) {
                System.out.println("Vous êtes en âge de travailler.");
            } else if (age >= 55 && age < 67) {
                System.out.println("Attention, vous pourriez avoir du mal à trouver un emploi.");
            } else {
                System.out.println("Vous êtes en retraite.");
            }
        }
    }
}

