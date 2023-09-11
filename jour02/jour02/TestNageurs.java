package jour02;
// Interface Nageur
interface Nageur {
    void nager();
}

// Classe Homme implémentant l'interface Nageur
class Homme implements Nageur {
    @Override
    public void nager() {
        System.out.println("L'homme nage.");
    }
}

// Classe Poisson implémentant l'interface Nageur
class Poisson implements Nageur {
    @Override
    public void nager() {
        System.out.println("Le poisson nage rapidement.");
    }
}

public class TestNageurs {
    public static void main(String[] args) {
        Nageur nageur1 = new Homme();
        Nageur nageur2 = new Poisson();

        nageur1.nager(); // Affiche "L'homme nage."
        nageur2.nager(); // Affiche "Le poisson nage rapidement."
    }
}
