package Jour03;

import java.util.Optional;

public class LongueurChaineAvecOptional {
    public static void main(String[] args) {
        String chaine = null;
        int longueur = trouverLongueur(chaine);
        System.out.println("Longueur de la chaîne : " + longueur);
    }

    public static int trouverLongueur(String chaine) {
        Optional<String> chaineOptionnelle = Optional.ofNullable(chaine);
        return chaineOptionnelle.map(String::length).orElse(-1); // Si la chaîne est null, retourne -1
    }
}
