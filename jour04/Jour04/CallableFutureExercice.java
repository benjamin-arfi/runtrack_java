import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableFutureExercice {
    public static void main(String[] args) {
        // Créer un Callable pour multiplier deux nombres
        Callable<Integer> multiplicationCallable = () -> {
            int nombre1 = 5;
            int nombre2 = 6;
            return nombre1 * nombre2;
        };

        // Créer une FutureTask pour exécuter le Callable
        FutureTask<Integer> futureTask = new FutureTask<>(multiplicationCallable);

        // Créer un thread pour exécuter la tâche FutureTask
        Thread thread = new Thread(futureTask);
        thread.start();

        try {
            // Attendre que la tâche soit terminée et obtenir le résultat
            int resultat = futureTask.get();
            System.out.println("Résultat de la multiplication : " + resultat);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
