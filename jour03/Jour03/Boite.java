package Jour03;

public class Boite<T> {
    private T contenu;

    // Méthode pour ajouter un élément à la boîte
    public void ajouter(T element) {
        contenu = element;
    }

    // Méthode pour récupérer l'élément de la boîte
    public T recuperer() {
        return contenu;
    }

    public static void main(String[] args) {
        // Créer une boîte de type String
        Boite<String> boiteString = new Boite<>();

        // Ajouter une chaîne à la boîte
        boiteString.ajouter(" Hello");

        // Récupérer la chaîne de la boîte et l'afficher
        String resultatString = boiteString.recuperer();
        System.out.println("Contenu de la boite : " + resultatString);

        // Créer une boîte de type Integer
        Boite<Integer> boiteInteger = new Boite<>();

        // Ajouter un entier à la boîte
        boiteInteger.ajouter(42);

        // Récupérer l'entier de la boîte et l'afficher
        int resultatInteger = boiteInteger.recuperer();
        System.out.println("Contenu de la boite d'entier : " + resultatInteger);
    }
}

