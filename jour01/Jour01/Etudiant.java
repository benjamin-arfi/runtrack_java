import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Etudiant {
    private String nom;
    private List<Double> notes;

    public Etudiant(String nom) {
        this.nom = nom;
        this.notes = new ArrayList<>();
    }

    public void ajouterNote(double note) {
        notes.add(note);
    }

    public double obtenirNoteMax() {
        if (notes.isEmpty()) {
            return 0.0; // Si aucune note n'a été ajoutée, retourne 0.
        }
        return Collections.max(notes);
    }

    public double obtenirNoteMin() {
        if (notes.isEmpty()) {
            return 0.0; // Si aucune note n'a été ajoutée, retourne 0.
        }
        return Collections.min(notes);
    }

    public double calculerMoyenne() {
        if (notes.isEmpty()) {
            return 0.0; // Si aucune note n'a été ajoutée, retourne 0.
        }

        double somme = 0.0;
        for (double note : notes) {
            somme += note;
        }
        return somme / notes.size();
    }

    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant("Alice");

        // Ajout de quelques notes
        etudiant.ajouterNote(85.0);
        etudiant.ajouterNote(92.5);
        etudiant.ajouterNote(78.0);

        // Obtention de la note la plus élevée
        double noteMax = etudiant.obtenirNoteMax();
        System.out.println("Note la plus élevée : " + noteMax);

        // Obtention de la note la plus basse
        double noteMin = etudiant.obtenirNoteMin();
        System.out.println("Note la plus basse : " + noteMin);

        // Calcul de la moyenne
        double moyenne = etudiant.calculerMoyenne();
        System.out.println("Moyenne des notes : " + moyenne);
    }
}
