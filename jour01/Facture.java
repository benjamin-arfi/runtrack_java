public class Facture {
    public static void main(String[] args){
        int quantite;
        Double prix = 49.99;
        quantite = 3;
        double tarifHT = prix *quantite;
        System.out.println("Le montant Hors taxe est : "+tarifHT);
        Double tva = 0.2 * tarifHT;
        System.out.println("Le montant de la tva : "+tva);
        double TTC = tva + tarifHT;
        System.out.println("Le montant TTC : "+TTC);
    }
}
