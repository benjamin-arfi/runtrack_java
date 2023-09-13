public class ThreadInterruptionExercice {
    public static void main(String[] args) {
        int dureeEnSecondes = 6; // Temps total de sommeil en secondes

        Thread thread = new Thread(() -> {
            try {
                System.out.println("Le thread commence à dormir.");
                Thread.sleep(dureeEnSecondes * 1000 / 2); // Dormir pendant la moitié du temps
                System.out.println("Le thread a terminé son sommeil.");
            } catch (InterruptedException e) {
                System.out.println("Le thread a été interrompu pendant son sommeil." + dureeEnSecondes);
            }
        });

        thread.start(); // Démarrer le thread
        

        try {
            Thread.sleep(dureeEnSecondes * 1000); // Attendre la fin du temps total
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        // Interrompre le thread après la moitié du temps spécifié
        
    }
}

