package jour02;

// Interface Instrument
interface Instrument {
    void jouer();
}

// Classe Guitare implémentant l'interface Instrument
class Guitare implements Instrument {
    @Override
    public void jouer() {
        System.out.println("La guitare joue un air rock.");
    }
}

// Classe Piano implémentant l'interface Instrument
class Piano implements Instrument {
    @Override
    public void jouer() {
        System.out.println("Le piano joue une mélodie douce.");
    }
}

public class TestInstruments {
    public static void main(String[] args) {
        Instrument guitare = new Guitare();
        Instrument piano = new Piano();

        guitare.jouer(); // Affiche "La guitare joue un air rock."
        piano.jouer();   // Affiche "Le piano joue une mélodie douce."
    }
}

