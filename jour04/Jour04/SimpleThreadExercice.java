public class SimpleThreadExercice {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Salut du thread!");
                try {
                    Thread.sleep(1000); // Attendre une seconde entre chaque affichage
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start(); // Démarrer le thread

        try {
            thread.join(); // Attendre que le thread se termine
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
