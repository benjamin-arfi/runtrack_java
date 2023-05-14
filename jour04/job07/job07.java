package jour04.job07;
import java.util.Scanner;
public class job07 {
    public static void main(String[] args) throws InterruptedException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrer la taille du tableau: ");
            int size = scanner.nextInt();

            int[]  tableau = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Entrer les valeurs  " + i + ": ");
                tableau[i] = scanner.nextInt();
            } 
        
            long startTime = System.currentTimeMillis();
            
    
            thread thread1 = new thread(tableau,0, size/2);
            thread thread2 = new thread(tableau,(size /2)+1, size-1);
    
            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();
            
            int TotaleSum = thread1.getsum() + thread2.getsum() ;
    
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            
            System.out.println(TotaleSum);
            System.out.println("Le temps d'exécution global est : " + duration + " millisecondes");
        }
}
}
