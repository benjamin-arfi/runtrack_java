import java.util.Arrays;
public class job08 {
    public static void main(String[] args) {
        int [][] tableau = {{5,9,3},{7,2,8},{1,6,4}};
        for (int i = 0; i < tableau.length; i++) {
                Arrays.sort(tableau[i]);
        }
      

        // 
        for(int i=0; i<tableau.length; i++){
            for(int j=i+1; j<tableau.length; j++){
              int temp = tableau[i][j];
              System.out.println(tableau[i][j-1]);
              System.out.println(tableau[j][i]);
              tableau[i][j] = tableau[j][i];
              tableau[j][i] = temp;
              System.out.println("################");
            }
        }
          
          // Trier les éléments de chaque ligne
        for(int i=0; i<tableau.length; i++){
            Arrays.sort(tableau[i]);
          }
        
          
         for (int r = 0; r < tableau.length; r++) {
            for (int ind = 0; ind < tableau.length; ind++) {
               System.out.println(tableau[r][ind] + " ");
            }
            System.out.println();
         }
    }
}
