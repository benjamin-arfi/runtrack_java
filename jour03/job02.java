public class job02 {
    public static void main(String[] args) {
        int [] monTableau = {12,6,76,89};
        for ( int i=0; i<monTableau.length; i++ ) {
        System.out.println( monTableau[ i ] );
        }
        monTableau[1]= 34;
        for (int j = 0; j < monTableau.length; j++) {
            System.out.println(monTableau[j]);
        }
    }
    
}
