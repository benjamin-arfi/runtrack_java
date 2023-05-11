public class job07 {
    public static void main(String[] args) {
        int [][] matrice1 = { {1,2,3} , {4,5,6} , {7,8,9} };
        int [][] matrice2 = { {10,20,30} , {40,50,60} , {70,80,90} };
        int [][] resultat = new int[3][3];
        for(int i=0; i<matrice1.length; i++) {
            for(int j=0; j<matrice1[i].length; j++){
                System.out.println(matrice1[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0; i<matrice1.length; i++) {
            for(int j=0; j<matrice1[i].length; j++) {
                resultat[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }
        for (int k = 0; k < resultat.length; k++) {
            for (int index = 0; index < resultat.length; index++) {
                System.out.println(resultat[k][index] + " ");
            }
            System.out.println();

        }
        
}
}
