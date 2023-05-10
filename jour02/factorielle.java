import java.util.Scanner;

public class factorielle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez votre chiffre  : ");
            int chiffre = scanner.nextInt();
            long factorielle = 1;
            for (int i = 1; i <= chiffre; i++) {
                factorielle *= i;
            }
    
            System.out.println("La factorielle du nombre " + chiffre + " est : " + factorielle);
    
            scanner.close();
        }
    }
}