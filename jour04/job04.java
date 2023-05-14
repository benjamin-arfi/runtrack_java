package jour04;
import java.util.Scanner;
public class job04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre maximum a compter :");
        int length = scanner.nextInt();
        scanner.close();
        long startTime = System.currentTimeMillis();
        for (int index = 1; index <= length; index++) {
            System.out.println(index);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Le temps d'exécution global est : " + duration + " millisecondes");
    }
}
