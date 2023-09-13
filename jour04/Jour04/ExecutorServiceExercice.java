import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExercice {
    public static void main(String[] args) {
        // Créer un ExecutorService avec un pool de threads
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        // Exécuter plusieurs tâches
        for (int i = 1; i <= 3; i++) {
            int argument = i;
            int facteur = 3;
            Runnable task = () -> {
                int resultat = multiplier(argument, facteur);
                System.out.println("Résultat de la multiplication pour " + argument + " : " + resultat);
            };
            executorService.execute(task);
        }

        // Arrêter proprement l'ExecutorService
        executorService.shutdown();

        try {
            // Attendre que toutes les tâches soient terminées ou que le délai d'attente soit écoulé
            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                // Si le délai d'attente est écoulé, forcer l'arrêt des tâches en cours
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Méthode pour multiplier un argument par un facteur
    private static int multiplier(int argument, int facteur) {
        return argument * facteur;
    }
}

