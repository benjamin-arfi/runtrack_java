import java.lang.Math;

// Classe de base pour une forme géométrique
abstract class Forme {
    abstract double calculerAire();
}

// Classe pour un cercle
class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    double calculerAire() {
        return Math.PI * rayon * rayon;
    }
}

// Classe pour un carré
class Carre extends Forme {
    private double cote;

    public Carre(double cote) {
        this.cote = cote;
    }

    @Override
    double calculerAire() {
        return cote * cote;
    }
}

public class TestFormes {
    public static void main(String[] args) {
        // Création d'une instance de Cercle
        Cercle cercle = new Cercle(2.0);

        // Calcul de l'aire du cercle
        double aireCercle = cercle.calculerAire();
        System.out.println("Aire du cercle : " + aireCercle);

        // Création d'une instance de Carré
        Carre carre = new Carre(7.0);

        // Calcul de l'aire du carré
        double aireCarre = carre.calculerAire();
        System.out.println("Aire du carré : " + aireCarre);
    }
}

