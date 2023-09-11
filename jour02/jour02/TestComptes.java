package jour02;

import java.util.Scanner;

class CompteBancaire {
    protected double solde;
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

    public double getSolde() {
        return solde;
    }
}

class CompteCourant extends CompteBancaire {
    public CompteCourant(double soldeInitial) {
        super(soldeInitial);
    }
}

class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(double soldeInitial, double tauxInteret) {
        super(soldeInitial);
        this.tauxInteret = tauxInteret;
    }

    public void ajouterInteret() {
        double interet = getSolde() * (tauxInteret / 100);
        solde+= interet;
        System.out.println(interet + " $ Intérêts ajoutés au compte épargne. Nouveau solde : " + getSolde());
    }
}

public class TestComptes {
    public static void main(String[] args) {
        CompteCourant compteCourant = new CompteCourant(100);
        CompteEpargne compteEpargne = new CompteEpargne(200, 2); // Taux d'intérêt de 2%

        System.out.println("Compte courant");
        compteCourant.afficherSolde();
        System.out.println("compte epargne :");
        compteEpargne.afficherSolde();
        
        compteEpargne.ajouterInteret();
        
        System.out.println("Compte courant");
        compteCourant.afficherSolde();
        System.out.println("compte epargne :");
        compteEpargne.afficherSolde();
    }
}

