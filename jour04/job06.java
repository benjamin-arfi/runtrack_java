package jour04;
import java.util.Scanner;
public class job06 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrer la taille du tableau: ");
            int size = scanner.nextInt();

            int[] tableau = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Entrer les valeurs  " + i + ": ");
                tableau[i] = scanner.nextInt();
            }

            System.out.println("les valeurs aditionnees sont :");
            int resultat = 0;
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                resultat+= tableau[i] ;
                
            }
            System.out.println(resultat);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            System.out.println("Le temps d'exécution global est : " + duration + " millisecondes");
        }
    }
}
