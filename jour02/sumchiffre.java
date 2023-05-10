
public class sumchiffre {
    public static void main(String[] args) {
      int chiffre = 1234;
      int calcul = 0;
      while (chiffre != 0) {
        int nombre = chiffre % 10;
        calcul+=nombre;
        chiffre /=10;
    }
    System.out.println(calcul);
    }
}
