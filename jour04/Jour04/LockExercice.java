import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExercice {
    public static void main(String[] args) {
        // Créer un compte bancaire avec un solde initial de 200
        CompteBancaire compte = new CompteBancaire(200);

        // Créer deux threads pour effectuer des retraits en même temps
        Thread thread1 = new Thread(new RetraitRunnable(compte, 50));
        Thread thread2 = new Thread(new RetraitRunnable(compte, 50));

        // Démarrer les deux threads
        thread1.start();
        thread2.start();

        try {
            // Attendre que les threads se terminent
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Afficher le solde final du compte
        System.out.println("Solde final du compte : " + compte.getSolde());
    }
}

// Classe représentant le compte bancaire
class CompteBancaire {
    private int solde;
    private Lock verrou = new ReentrantLock();

    public CompteBancaire(int soldeInitial) {
        this.solde = soldeInitial;
    }

    // Méthode pour effectuer un retrait sécurisé avec un verrou
    public void retirer(int montant) {
        verrou.lock(); // Acquérir le verrou
        try {
            if (montant > 0 && montant <= solde) {
                System.out.println("Retrait de " + montant + " euros.");
                solde -= montant;
            } else {
                System.out.println("Retrait impossible.");
            }
        } finally {
            verrou.unlock(); // Libérer le verrou dans tous les cas (même en cas d'exception)
        }
    }

    // Méthode pour obtenir le solde du compte
    public int getSolde() {
        return solde;
    }
}

// Runnable pour effectuer des retraits
class RetraitRunnable implements Runnable {
    private CompteBancaire compte;
    private int montant;

    public RetraitRunnable(CompteBancaire compte, int montant) {
        this.compte = compte;
        this.montant = montant;
    }

    @Override
    public void run() {
        compte.retirer(montant);
    }
}
