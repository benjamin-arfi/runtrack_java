package jour04.job05;
import java.util.Scanner;
public class thread05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre maximum a compter :");
        int end = scanner.nextInt();
        scanner.close();

        long startTime = System.currentTimeMillis();
        int start = 1;
        int mid = (start + end) / 2;

        job05 thread1 = new job05(start, mid);
        job05 thread2 = new job05(mid + 1, end);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Le temps d'exécution global est : " + duration + " millisecondes");
       
    }
}