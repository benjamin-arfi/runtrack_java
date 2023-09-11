package jour02;

class DivisionParZeroException extends Exception {
    public DivisionParZeroException() {
        super("Division par zéro n'est pas autorisée.");
    }
}

public class DivisionDemo {
    public static double diviser(double numerateur, double denominateur) throws DivisionParZeroException {
        if (denominateur == 0) {
            throw new DivisionParZeroException();
        }
        return numerateur / denominateur;
    }

    public static void main(String[] args) {
        try {
            double resultat = diviser(10.0, 2.0);
            System.out.println("Résultat : " + resultat);

            // Essayez de diviser par zéro
            resultat = diviser(5.0, 0.0); // Cela provoquera une DivisionParZeroException
            System.out.println("Résultat : " + resultat); // Cette ligne ne sera jamais atteinte
        } catch (DivisionParZeroException e) {
            System.out.println("Une exception a été attrapée : " + e.getMessage());
        }
    }
}

