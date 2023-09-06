public class Voiture {
    private String marque;
    private String couleur;
    private int vitesse;

    public Voiture(String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
        this.vitesse = 0;
    }

    public void demarrer() {
        System.out.println("La voiture de marque " + marque + " de couleur " + couleur + " démarre.");
    }

    public void accelerer() {
        vitesse += 10;
        System.out.println("La voiture accélère à " + vitesse + " km/h.");
    }

    public void freiner() {
        while (vitesse > 0) {
            vitesse -= 10;
            System.out.println("La voiture freine, vitesse actuelle : " + vitesse + " km/h.");
        }
    }

    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Toyota", "rouge");

        maVoiture.demarrer();
        maVoiture.accelerer();
        maVoiture.accelerer();
        maVoiture.freiner();
    }
}
