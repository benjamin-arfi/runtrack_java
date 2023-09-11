import java.util.Scanner;
class VitesseLimiteDepasseeException extends Exception {
    public VitesseLimiteDepasseeException() {
        super("La vitesse limite de 100 km/h a été dépassée.");
    }
}

public class Voiture {
    private String marque;
    private String couleur;
    private int vitesse;
    private Scanner scanner;

    public Voiture(String marque, String couleur, int vitesseInitial) {
        this.marque = marque;
        this.couleur = couleur;
        this.vitesse = vitesseInitial;
        this.scanner = new Scanner(System.in);
    }

    public void demarrer() {
        System.out.println("La voiture de marque " + marque + " de couleur " + couleur + " démarre.");
    }

    public void accelerer() throws VitesseLimiteDepasseeException {
        if (vitesse + 10 > 100) {
            throw new VitesseLimiteDepasseeException();
        }
        vitesse += 10;
        System.out.println("La voiture accélère à " + vitesse + " km/h.");
    }

    public void freiner() {
        if (vitesse >= 10) {
            vitesse -= 10;
            System.out.println("La voiture freine, vitesse actuelle : " + vitesse + " km/h.");
        } else {
            vitesse = 0;
            System.out.println("La voiture est à l'arrêt.");
        }
    }

    public void interactionUtilisateur() throws VitesseLimiteDepasseeException {
        System.out.println("Entrez la vitesse initiale de la voiture : ");
        int vitesseInitiale = scanner.nextInt();
        vitesse = vitesseInitiale;

        while (true) {
            System.out.println("\nQue souhaitez-vous faire ? (1 - Démarrer, 2 - Accélérer, 3 - Freiner, 4 - Quitter)");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Démarrer : ");
                    demarrer();
                    break;
                case 2:
                    System.out.print("Accélérer : ");
                    accelerer();
                    break;
                case 3:
                    System.out.print("Freiner : ");
                    freiner();
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
    }

    public static void main(String[] args) {
        Voiture voiture = new Voiture("Toyota", "Rouge", 0);
    try{
        voiture.interactionUtilisateur();
    }catch (VitesseLimiteDepasseeException e) {
        System.out.println("Exception : " + e.getMessage());
    }
}
}
