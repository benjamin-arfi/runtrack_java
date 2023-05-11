public class job03 {
    public static void main(String[] args) {
        String [] nom = {"Josette","John","Myrtille","Marc"};
        System.out.println(nom[1]); 
        nom[2] = "Mireille";
        for (int i = 0; i < nom.length; i++) {
            System.out.println(nom[i]);
        }
    }
}
