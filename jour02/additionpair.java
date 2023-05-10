public class additionpair {
    public static void main(String[] args) {
        int sum = 0;
        for (int index = 0; index <= 100; index=index+2) {
           sum += index;
        }
        System.out.println("la somme des nombres pairs entre 1 et 100 est : "+sum);
    }
}
