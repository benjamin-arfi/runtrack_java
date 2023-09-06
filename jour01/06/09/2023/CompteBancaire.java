import java.util.Scanner;

public class CompteBancaire {
    private double solde;
    private Scanner scanner;

    public CompteBancaire(double soldeInitial) {
        if (soldeInitial < 0) {
            System.out.println("Le solde initial ne peut pas être négatif. Le solde est initialisé à zéro.");
            this.solde = 0;
        } else {
            this.solde = soldeInitial;
        }
        this.scanner = new Scanner(System.in);
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " effectué avec succès. Nouveau solde : " + solde);
        } else {
            System.out.println("Le montant du dépôt doit être supérieur à zéro.");
        }
    }

    public void retirer(double montant) {
        if (montant > 0) {
            if (solde >= montant) {
                solde -= montant;
                System.out.println("Retrait de " + montant + " effectué avec succès. Nouveau solde : " + solde);
            } else {
                System.out.println("Fonds insuffisants pour effectuer le retrait.");
            }
        } else {
            System.out.println("Le montant du retrait doit être supérieur à zéro.");
        }
    }

    public void afficherSolde() {
        System.out.println("Solde actuel : " + solde);
    }

    public void interactionUtilisateur() {
        while (true) {
            System.out.println("\nQue souhaitez-vous faire ? (1 - Déposer, 2 - Retirer, 3 - Afficher le solde, 4 - Quitter)");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Montant à déposer : ");
                    double montantDepot = scanner.nextDouble();
                    deposer(montantDepot);
                    break;
                case 2:
                    System.out.print("Montant à retirer : ");
                    double montantRetrait = scanner.nextDouble();
                    retirer(montantRetrait);
                    break;
                case 3:
                    afficherSolde();
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
        CompteBancaire compte = new CompteBancaire(1000); // Crée un compte avec un solde initial de 1000
        compte.interactionUtilisateur();
    }
}
