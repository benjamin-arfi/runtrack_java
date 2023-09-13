public class RunnableInterfaceExercice {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(10+20+"e"+20+30);
                try {
                    Thread.sleep(1000); // Attendre une seconde entre chaque affichage
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(runnable);

        thread.start(); // Démarrer le thread

        try {
            thread.join(); // Attendre que le thread se termine
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
